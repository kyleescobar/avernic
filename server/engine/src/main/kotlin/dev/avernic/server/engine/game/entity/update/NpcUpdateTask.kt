package dev.avernic.server.engine.game.entity.update

import dev.avernic.server.engine.game.MovementType
import dev.avernic.server.engine.game.entity.Npc
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.manager.GpiManager
import io.guthix.buffer.BitBuf
import io.guthix.buffer.toBitMode
import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled

class NpcUpdateTask(private val player: Player) {

    internal fun execute(buf: ByteBuf) {
        val mainBuf = Unpooled.buffer()
        val bitBuf = mainBuf.toBitMode()

        updateLocalNpc(bitBuf)
        updateExternalNpc(bitBuf)

        val maskBuf = bitBuf.toByteMode()

        /*
         * Process npc update flags for each NPC in the local player's scene.
         */
        player.npcs.filter { it.updateFlags.isNotEmpty() }.forEach { processNpcUpdateFlags(it, maskBuf) }

        buf.writeBytes(mainBuf)
    }

    private fun updateLocalNpc(buf: BitBuf): BitBuf {
        val removals = mutableListOf<Npc>()
        buf.writeBits(player.npcs.size, 8)
        for(npc in player.npcs) {
            when {
                npc.movementType == MovementType.WALK -> {
                    buf.writeBoolean(true)
                    buf.writeBits(1, 2)
                    buf.writeBits(npc.walkDirectionType, 3)
                    buf.writeBoolean(npc.updateFlags.isNotEmpty())
                }
                npc.movementType == MovementType.RUN -> {
                    buf.writeBoolean(true)
                    buf.writeBits(2, 2)
                    buf.writeBits(npc.walkDirectionType, 3)
                    buf.writeBits(npc.walkDirectionType, 3)
                    buf.writeBoolean(npc.updateFlags.isNotEmpty())
                }
                npc.isDead
                || npc.movementType == MovementType.TELEPORT
                || !player.tile.isWithinRadius(npc.tile, GpiManager.RENDER_DISTANCE) -> {
                    buf.writeBoolean(true)
                    buf.writeBits(3, 2)
                    removals.add(npc)
                }
                npc.updateFlags.isNotEmpty() -> {
                    buf.writeBoolean(true)
                    buf.writeBits(0, 2)
                }
                else -> {
                    buf.writeBoolean(false)
                }
            }
        }

        player.npcs.removeAll(removals)
        return buf
    }

    private fun updateExternalNpc(buf: BitBuf): BitBuf {
        var added = 0
        for(npc in player.world.findNpcs(player.tile, GpiManager.RENDER_DISTANCE)) {
            if(added > 16) break
            if(!player.npcs.contains(npc)) {
                buf.writeBits(npc.index, 15)
                buf.writeBoolean(npc.updateFlags.isNotEmpty())
                buf.writeBits(npc.direction, 3)
                buf.writeBits(getRelativeInt(npc.tile.x, player.tile.x), 5)
                buf.writeBits(getRelativeInt(npc.tile.y, player.tile.y), 5)
                buf.writeBoolean(false)
                buf.writeBits(npc.id, 14)
                buf.writeBoolean(npc.updateFlags.isNotEmpty())
                player.npcs.add(npc)
                added++
            }
        }

        if(player.npcs.any { it.updateFlags.isNotEmpty() }) {
            buf.writeBits(32767, 15)
        }

        return buf
    }

    private fun Npc.shouldRender(): Boolean {
        return player.tile.isWithinRadius(this.tile, GpiManager.RENDER_DISTANCE) && player.npcs.contains(this)
    }

    private val Npc.direction: Int get() = when(orientation) {
        in 0 until 512 -> 0
        in 512 until 1024 -> 1
        in 1024 until 1536 -> 2
        else -> 3
    }

    private val Npc.walkDirectionType: Int get() {
        val dx = this.tile.x - this.prevTile.x
        val dy = this.tile.y - this.prevTile.y
        return getDirectionType(dx, dy)
    }

    private fun getDirectionType(dx: Int, dy: Int): Int {
        return MOVEMENT[1 - dy][dx + 1]
    }

    private fun getRelativeInt(source: Int, target: Int): Int {
        var delta = source - target
        if(delta < 0) {
           delta += 32
        }
        return delta
    }

    private fun processNpcUpdateFlags(npc: Npc, maskBuf: ByteBuf) {
        var mask = 0
        npc.updateFlags.forEach { updateFlag ->
            mask = mask or updateFlag.mask
        }
        maskBuf.writeByte(mask)
        npc.updateFlags.forEach { updateFlag ->
            updateFlag.encode(maskBuf, npc)
        }
    }

    companion object {
        private val MOVEMENT = arrayOf(
            intArrayOf(0, 1, 2),
            intArrayOf(3, -1, 4),
            intArrayOf(5, 6, 7)
        )
    }
}