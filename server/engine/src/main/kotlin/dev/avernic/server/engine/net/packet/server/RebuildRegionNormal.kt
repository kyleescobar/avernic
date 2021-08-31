package dev.avernic.server.engine.net.packet.server

import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import dev.avernic.server.engine.net.game.ServerPacket
import io.guthix.buffer.writeShortAdd
import io.netty.buffer.ByteBuf

@ServerPacket(opcode = 2, type = PacketType.VARIABLE_SHORT)
class RebuildRegionNormal(
    val player: Player,
    val gpi: Boolean = false
) : Packet {
    companion object : Codec<RebuildRegionNormal> {
        override fun encode(session: Session, packet: RebuildRegionNormal, buf: ByteBuf) {
            if(packet.gpi) {
               packet.player.gpi.encode(buf)
            }

            buf.writeShortAdd(packet.player.scene.middleChunk.y)
            buf.writeShortLE(packet.player.scene.middleChunk.x)

            val xteaKeys = packet.player.scene.getRegionXteaKeys()

            buf.writeShort(xteaKeys.size)
            xteaKeys.forEach { for(xtea in it) { buf.writeInt(xtea) } }
        }
    }
}