package dev.avernic.server.engine.net.packet.server

import dev.avernic.server.config.XteaConfig
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import dev.avernic.server.engine.net.game.ServerPacket
import io.guthix.buffer.writeShortAdd
import io.guthix.buffer.writeStringCP1252
import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled

@ServerPacket(opcode = 2, type = PacketType.VARIABLE_SHORT)
class RebuildRegionNormal(val player: Player, val gpi: Boolean = false) : Packet {
    companion object : Codec<RebuildRegionNormal> {
        override fun encode(session: Session, packet: RebuildRegionNormal, buf: ByteBuf) {
            if(packet.gpi) {
               packet.player.gpi.encode(buf)
            }

            /*
             * Write the loaded region xteas.
             */

            val tile = packet.player.tile
            val chunkX = tile.chunkX
            val chunkY = tile.chunkY

            buf.writeShortAdd(chunkY)
            buf.writeShortLE(chunkX)

            val lx = (chunkX - 6) / 8
            val rx = (chunkX + 6) / 8
            val ly = (chunkY - 6) / 8
            val ry = (chunkY + 6) / 8

            var regionCount = 0
            val xteas = mutableListOf<Int>()

            for(x in lx..rx) {
                for(y in ly..ry) {
                    val regionId = y + (x shl 8)
                    xteas.addAll(XteaConfig.regionKeys(regionId).toList())
                    regionCount++
                }
            }

            buf.writeShort(regionCount)

            xteas.forEach { xtea ->
                buf.writeInt(xtea)
            }
        }
    }
}