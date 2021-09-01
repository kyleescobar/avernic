package dev.avernic.server.engine.net.packet.server

import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.ServerPacket
import io.guthix.buffer.writeIntME
import io.netty.buffer.ByteBuf

@ServerPacket(opcode = 60)
class IfMoveSub(
    val fromParent: Int,
    val fromChild: Int,
    val toParent: Int,
    val toChild: Int
) : Packet {
    companion object : Codec<IfMoveSub> {
        override fun encode(session: Session, packet: IfMoveSub, buf: ByteBuf) {
            val from = (packet.fromParent shl 16) or packet.fromChild
            val to = (packet.toParent shl 16) or packet.toChild
            buf.writeIntME(from)
            buf.writeInt(to)
        }
    }
}