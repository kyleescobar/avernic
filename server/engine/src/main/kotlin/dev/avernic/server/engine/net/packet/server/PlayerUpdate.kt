package dev.avernic.server.engine.net.packet.server

import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import dev.avernic.server.engine.net.game.ServerPacket
import io.netty.buffer.ByteBuf

@ServerPacket(opcode = 38, type = PacketType.VARIABLE_SHORT)
class PlayerUpdate(val payload: ByteBuf) : Packet {
    companion object : Codec<PlayerUpdate> {
        override fun encode(session: Session, packet: PlayerUpdate, buf: ByteBuf) {
            buf.writeBytes(packet.payload)
        }
    }
}