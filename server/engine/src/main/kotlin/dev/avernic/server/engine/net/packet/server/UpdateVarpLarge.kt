package dev.avernic.server.engine.net.packet.server

import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import dev.avernic.server.engine.net.game.ServerPacket
import io.netty.buffer.ByteBuf

@ServerPacket(opcode = 70, type = PacketType.FIXED)
class UpdateVarpLarge(val id: Int, val value: Int) : Packet {
    companion object : Codec<UpdateVarpLarge> {
        override fun encode(session: Session, packet: UpdateVarpLarge, buf: ByteBuf) {
            buf.writeShort(packet.id)
            buf.writeIntLE(packet.value)
        }
    }
}