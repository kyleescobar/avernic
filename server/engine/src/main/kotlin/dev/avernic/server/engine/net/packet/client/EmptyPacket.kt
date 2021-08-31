package dev.avernic.server.engine.net.packet.client

import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.ClientPacket
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import io.netty.buffer.ByteBuf

@ClientPacket(opcode = -1, type = PacketType.FIXED, length = 0)
class EmptyPacket(val data: ByteArray) : Packet {

    override fun handle(session: Session) {}

    companion object : Codec<EmptyPacket> {
        override fun decode(session: Session, buf: ByteBuf): EmptyPacket {
            val bytes = ByteArray(buf.readableBytes())
            buf.readBytes(bytes)
            return EmptyPacket(bytes)
        }
    }
}