package dev.avernic.server.engine.game.entity.update

import dev.avernic.server.engine.game.MovementType
import dev.avernic.server.engine.game.World
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.manager.GpiManager
import dev.avernic.server.engine.game.map.Tile
import io.guthix.buffer.BitBuf
import io.guthix.buffer.toBitMode
import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import java.util.*
import kotlin.math.abs

class PlayerUpdateTask(private val player: Player) {

    private var skipCount = 0


    internal fun execute(buf: ByteBuf) {
        val mainBuf = Unpooled.buffer()
        val maskBuf = Unpooled.buffer()

        processLocalPlayers(mainBuf, maskBuf, true)
        processLocalPlayers(mainBuf, maskBuf, false)
        processExternalPlayers(mainBuf, maskBuf, false)
        processExternalPlayers(mainBuf, maskBuf, true)

        player.gpi.localPlayerCount = 0
        player.gpi.externalPlayerCount = 0
        for(index in 1 until World.MAX_PLAYERS) {
            player.gpi.skipFlags[index] = player.gpi.skipFlags[index] shr 1
            if(player.gpi.localPlayers[index] != null) {
                player.gpi.localPlayerIndexes[player.gpi.localPlayerCount++] = index
            } else {
                player.gpi.externalPlayerIndexes[player.gpi.externalPlayerCount++] = index
            }
        }

        mainBuf.writeBytes(maskBuf)
        maskBuf.release()

        buf.writeBytes(mainBuf)
    }

    private fun processLocalPlayers(buf: ByteBuf, maskBuf: ByteBuf, activityFlag: Boolean) {
        fun shouldUpdateLocalPlayer(thisPlayer: Player, localPlayer: Player): Boolean {
            return (localPlayer.updateFlags.isNotEmpty()
                    || !thisPlayer.tile.isWithinRadius(localPlayer.tile, GpiManager.RENDER_DISTANCE)
                    || localPlayer.movementType != MovementType.NONE
                    )
        }

        fun updateLocalPlayer(localPlayer: Player, buf: BitBuf, maskBuf: ByteBuf) {
            val shouldUpdate = localPlayer.updateFlags.isNotEmpty()
            buf.writeBoolean(shouldUpdate)
            if(localPlayer.movementType == MovementType.TELEPORT) {
                buf.writeBits(3, 2)
                val dx = localPlayer.tile.x - localPlayer.prevTile.x
                val dy = localPlayer.tile.y - localPlayer.prevTile.y
                val dz = localPlayer.tile.plane - localPlayer.prevTile.plane
                if(abs(dx) <= GpiManager.RENDER_DISTANCE && abs(dy) <= GpiManager.RENDER_DISTANCE) {
                    buf.writeBoolean(false)
                    buf.writeBits(dz and 0x3, 2)
                    buf.writeBits(dx and 0x1F, 5)
                    buf.writeBits(dy and 0x1F, 5)
                } else {
                    buf.writeBoolean(true)
                    buf.writeBits(dz and 0x3, 2)
                    buf.writeBits(dx and 0x3FFF, 14)
                    buf.writeBits(dy and 0x3FFF, 14)
                }
            }
            else if(!player.tile.isWithinRadius(localPlayer.tile, GpiManager.RENDER_DISTANCE)) {
                buf.writeBits(0, 2)
                player.gpi.localPlayers[localPlayer.index] = null
            }
            else if(localPlayer.movementType == MovementType.WALK) {
                buf.writeBits(1, 2)
                buf.writeBits(getWalkDirection(localPlayer), 3)
            }
            else if(localPlayer.movementType == MovementType.RUN) {
                buf.writeBits(2, 2)
                buf.writeBits(getWalkDirection(localPlayer), 4)
            }
            else if(shouldUpdate) {
                buf.writeBits(0, 2)
            }
            if(shouldUpdate) {
                processUpdateFlags(localPlayer, maskBuf)
            }
        }

        fun skipLocalPlayers(buf: BitBuf, currentIndex: Int, activityFlag: Boolean) {
            ((currentIndex + 1) until  player.gpi.localPlayerCount)
                .asSequence()
                .map { player.gpi.localPlayerIndexes[it] }
                .filter { wasSkipped(it, activityFlag) }
                .map { player.gpi.localPlayers[it] }
                .map { it != null && shouldUpdateLocalPlayer(player, it) }
                .takeWhile { !it }
                .toList()
                .forEach { _ -> skipCount++ }
            buf.writeSkip(skipCount)
        }

        skipCount = 0
        val bitBuf = buf.toBitMode()
        for(i in 0 until player.gpi.localPlayerCount) {
            val localPlayerIndex = player.gpi.localPlayerIndexes[i]
            if(wasSkipped(localPlayerIndex, activityFlag)) {
                if(skipCount > 0) {
                    skipCount--
                    skipPlayer(localPlayerIndex)
                } else {
                    val localPlayer = player.gpi.localPlayers[localPlayerIndex]
                    val shouldUpdate = localPlayer != null && shouldUpdateLocalPlayer(player, localPlayer)
                    bitBuf.writeBoolean(shouldUpdate)
                    if(!shouldUpdate) {
                        skipLocalPlayers(bitBuf, i, activityFlag)
                        skipPlayer(localPlayerIndex)
                    } else {
                        updateLocalPlayer(localPlayer!!, bitBuf, maskBuf)
                    }
                }
            }
        }
        bitBuf.toByteMode()
    }

    private fun processExternalPlayers(buf: ByteBuf, maskBuf: ByteBuf, activityFlag: Boolean) {
        fun shouldUpdateExternalPlayer(thisPlayer: Player, externalPlayer: Player): Boolean {
            return (thisPlayer.tile.isWithinRadius(externalPlayer.tile, GpiManager.RENDER_DISTANCE)
                    || player.gpi.tileMultipliers[externalPlayer.index] != externalPlayer.tile.as18BitInteger)
        }

        fun updateExternalPlayer(externalPlayer: Player, buf: BitBuf, maskBuf: ByteBuf) {
            if(player.tile.isWithinRadius(externalPlayer.tile, GpiManager.RENDER_DISTANCE)) {
                buf.writeBits(0, 2)
                if(player.gpi.tileMultipliers[externalPlayer.index] != externalPlayer.tile.as18BitInteger) {
                    buf.writeBoolean(true)
                    updateTileLocation(externalPlayer, buf)
                } else {
                    buf.writeBoolean(false)
                }
                buf.writeBits(externalPlayer.tile.x, 13)
                buf.writeBits(externalPlayer.tile.y, 13)
                buf.writeBoolean(true)
                processUpdateFlags(externalPlayer, maskBuf, sortedSetOf(PlayerUpdateFlag.APPEARANCE))
                player.gpi.localPlayers[externalPlayer.index] = externalPlayer
            } else {
                updateTileLocation(externalPlayer, buf)
            }
        }

        fun skipExternalPlayers(buf: BitBuf, currentIndex: Int, activityFlag: Boolean) {
            ((currentIndex + 1) until player.gpi.externalPlayerCount)
                .asSequence()
                .map { player.gpi.externalPlayerIndexes[it] }
                .filter { wasSkipped(it, activityFlag) }
                .map { player.world.players[it] }
                .map { it != null && shouldUpdateExternalPlayer(player, it) }
                .takeWhile { !it }
                .toList()
                .forEach { _ -> skipCount++ }
            buf.writeSkip(skipCount)
        }

        skipCount = 0
        val bitBuf = buf.toBitMode()
        for(i in 0 until player.gpi.externalPlayerCount) {
            val externalPlayerIndex = player.gpi.externalPlayerIndexes[i]
            if(wasSkipped(externalPlayerIndex, activityFlag)) {
                if(skipCount > 0) {
                    skipCount--
                    skipPlayer(externalPlayerIndex)
                } else {
                    val externalPlayer = player.world.players[externalPlayerIndex]
                    val shouldUpdate = externalPlayer != null && shouldUpdateExternalPlayer(player, externalPlayer)
                    bitBuf.writeBoolean(shouldUpdate)
                    if(!shouldUpdate) {
                        skipExternalPlayers(bitBuf, i, activityFlag)
                        skipPlayer(externalPlayerIndex)
                    } else {
                        updateExternalPlayer(externalPlayer!!, bitBuf, maskBuf)
                        skipPlayer(externalPlayerIndex)
                    }
                }
            }
        }
        bitBuf.toByteMode()
    }

    private fun skipPlayer(playerIndex: Int) {
        player.gpi.skipFlags[playerIndex] = player.gpi.skipFlags[playerIndex] or 0x2
    }

    private fun wasSkipped(playerIndex: Int, activityFlag: Boolean) = if(activityFlag) {
        player.gpi.skipFlags[playerIndex] and 0x1 == 0
    } else {
        player.gpi.skipFlags[playerIndex] and 0x1 != 0
    }

    private fun BitBuf.writeSkip(count: Int) {
        when {
            count == 0 -> {
                writeBits(0, 2)
            }

            count < 32 -> {
                writeBits(1, 2)
                writeBits(count, 5)
            }

            count < 256 -> {
                writeBits(2, 2)
                writeBits(count, 8)
            }

            count < 2048 -> {
                writeBits(3, 2)
                writeBits(count, 11)
            }
        }
    }

    private fun updateTileLocation(externalPlayer: Player, buf: BitBuf) {
        val last = player.gpi.tileMultipliers[externalPlayer.index]
        val curr = externalPlayer.tile.as18BitInteger

        val ly = last and 0xFF
        val lx = (last shr 8) and 0xFF
        val lz = last shr 16

        val cy = curr and 0xFF
        val cx = (curr shr 8) and 0xFF
        val cz = curr shr 16

        val dx = cx -lx
        val dy = cy - ly
        val dz = (cz - lz) and 0x3

        if(dx == 0 && dy == 0) {
            buf.writeBits(1, 2)
            buf.writeBits(dz, 2)
        }
        else if(abs(dx) <= 1 && abs(dy) <= 1) {
            buf.writeBits(2, 2)
            buf.writeBits((dz shl 3) or getDirectionType(dx, dy), 5)
        }
        else {
            buf.writeBits(3, 2)
            buf.writeBits(Tile(dx, dy, dz).as18BitInteger, 18)
        }
        player.gpi.tileMultipliers[externalPlayer.index] = curr
    }

    private fun getDirectionType(dx: Int, dy: Int) = MOVEMENT[2 - dy][dx + 2]

    private fun getWalkDirection(localPlayer: Player): Int {
        val dx = localPlayer.tile.x - localPlayer.prevTile.x
        val dy = localPlayer.tile.y - localPlayer.prevTile.y
        return getDirectionType(dx, dy)
    }

    private fun processUpdateFlags(
        localPlayer: Player,
        maskBuf: ByteBuf,
        updateFlags: SortedSet<PlayerUpdateFlag> = sortedSetOf()
    ) {
        var mask = 0
        updateFlags.addAll(localPlayer.updateFlags)
        updateFlags.forEach {
            mask = mask or it.mask
        }
        if(mask >= 0xFF) {
            maskBuf.writeByte(mask or 0x20)
            maskBuf.writeByte(mask shr 8)
        } else {
            maskBuf.writeByte(mask)
        }
        updateFlags.forEach {
            it.encode(maskBuf, localPlayer)
        }
    }

    companion object {

        private val MOVEMENT = arrayOf(
            intArrayOf(11, 12, 13, 14, 15),
            intArrayOf(9, 5, 6, 7, 10),
            intArrayOf(7, 3, -1, 4, 8),
            intArrayOf(5, 0, 1, 2, 6),
            intArrayOf(0, 1, 2, 3, 4)
        )
    }
}