package dev.avernic.server.engine.net.packet.server

import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import dev.avernic.server.engine.net.game.ServerPacket
import io.netty.buffer.ByteBuf

@ServerPacket(opcode = 87, type = PacketType.FIXED)
class IfOpenTop(val interfaceId: Int) : Packet {
    companion object : Codec<IfOpenTop> {
        override fun encode(session: Session, packet: IfOpenTop, buf: ByteBuf) {
            buf.writeShort(packet.interfaceId)
        }
    }
}