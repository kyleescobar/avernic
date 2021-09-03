package dev.avernic.server.engine.net.packet.server

import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import dev.avernic.server.engine.net.game.ServerPacket
import io.netty.buffer.ByteBuf

@ServerPacket(opcode = 79, type = PacketType.VARIABLE_SHORT)
class UpdateNpcSmall(val buf: ByteBuf) : Packet {
    companion object : Codec<UpdateNpcSmall> {
        override fun encode(session: Session, packet: UpdateNpcSmall, buf: ByteBuf) {
            buf.writeBytes(packet.buf)
        }
    }
}