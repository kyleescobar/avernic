package dev.avernic.server.engine.net.packet.server

import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import dev.avernic.server.engine.net.game.ServerPacket
import io.guthix.buffer.writeStringCP1252
import io.netty.buffer.ByteBuf

@ServerPacket(opcode = 91, type = PacketType.VARIABLE_SHORT)
class RunClientScript(val id: Int, vararg val params: Any) : Packet {
    companion object : Codec<RunClientScript> {
        override fun encode(session: Session, packet: RunClientScript, buf: ByteBuf) {
            val paramBuilder = StringBuilder()
            for(param in packet.params.reversed()) {
                if(param is String) {
                    paramBuilder.append("s")
                } else {
                    paramBuilder.append("i")
                }
            }
            buf.writeStringCP1252("$paramBuilder")
            for(param in packet.params) {
                if(param is String) {
                    buf.writeStringCP1252(param)
                } else {
                    buf.writeInt(param as Int)
                }
            }
            buf.writeInt(packet.id)
        }
    }
}