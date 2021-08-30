package dev.avernic.server.engine.net.packet.server

import dev.avernic.server.engine.game.interf.InterfaceType
import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import dev.avernic.server.engine.net.game.ServerPacket
import io.guthix.buffer.writeByteAdd
import io.guthix.buffer.writeShortAdd
import io.netty.buffer.ByteBuf

@ServerPacket(opcode = 83, type = PacketType.FIXED)
class IfOpenSub(val parent: Int, val child: Int, val interfaceId: Int, val type: InterfaceType) : Packet {
    companion object : Codec<IfOpenSub> {
        override fun encode(session: Session, packet: IfOpenSub, buf: ByteBuf) {
            val component = (packet.parent shl 16) or packet.child
            buf.writeByteAdd(packet.type.id)
            buf.writeShortAdd(packet.interfaceId)
            buf.writeInt(component)
        }
    }
}