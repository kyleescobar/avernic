package dev.avernic.server.engine.net.packet.client

import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.ClientPacket
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import io.netty.buffer.ByteBuf

@ClientPacket(opcode = -1, type = PacketType.FIXED, length = 0)
class UnknownPacket : Packet {

    override fun handle(session: Session) {}

    companion object : Codec<UnknownPacket> {
        override fun decode(session: Session, buf: ByteBuf): UnknownPacket {
            return UnknownPacket()
        }
    }
}