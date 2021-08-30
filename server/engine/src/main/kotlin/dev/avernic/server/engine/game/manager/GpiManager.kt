package dev.avernic.server.engine.game.manager

import dev.avernic.server.common.inject
import dev.avernic.server.engine.game.World
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.net.packet.server.RebuildRegionNormal
import io.guthix.buffer.toBitMode
import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled

class GpiManager(private val player: Player) {

    private val world: World by inject()

    var localPlayerCount: Int = 0
    val localPlayers = arrayOfNulls<Player>(World.MAX_PLAYERS)
    val localPlayerIndexes = IntArray(World.MAX_PLAYERS)

    var externalPlayerCount = 0
    val externalPlayerIndexes = IntArray(World.MAX_PLAYERS)

    val tileMultipliers = IntArray(World.MAX_PLAYERS)

    val skipFlags = IntArray(World.MAX_PLAYERS)

    internal fun initialize() {
        localPlayers[player.index] = player
        localPlayerIndexes[localPlayerCount++] = player.index
        for(index in 1 until World.MAX_PLAYERS) {
            if(index != player.index) {
                val externalPlayer = world.players[index]
                tileMultipliers[index] = externalPlayer?.tile?.as18BitInteger ?: 0
                externalPlayerIndexes[externalPlayerCount++] = index
            }
        }
    }

    internal fun encode(buf: ByteBuf) {
        val gpiBuf = Unpooled.buffer()
        val bitBuf = gpiBuf.toBitMode()

        bitBuf.writeBits(player.tile.as30BitInteger, 30)

        for(index in 1 until World.MAX_PLAYERS) {
            if(index != player.index) {
                bitBuf.writeBits(tileMultipliers[index], 18)
            }
        }

        bitBuf.toByteMode()
        val gpiBytes = ByteArray(gpiBuf.readableBytes())
        gpiBuf.readBytes(gpiBytes)

        buf.writeBytes(gpiBytes)
    }
}