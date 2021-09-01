package dev.avernic.server.engine.net.packet.server

import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import dev.avernic.server.engine.net.game.ServerPacket
import io.guthix.buffer.writeSmallSmart
import io.guthix.buffer.writeStringCP1252
import io.netty.buffer.ByteBuf

@ServerPacket(opcode = 49, type = PacketType.VARIABLE_BYTE)
class SendMessageGame(
    val type: Int,
    val isInteractingMessage: Boolean,
    val message: String
) : Packet {
    companion object : Codec<SendMessageGame> {
        override fun encode(session: Session, packet: SendMessageGame, buf: ByteBuf) {
            buf.writeSmallSmart(packet.type)
            buf.writeBoolean(packet.isInteractingMessage)
            buf.writeStringCP1252(packet.message)
        }
    }
}