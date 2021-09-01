package dev.avernic.server.engine.net.packet.server

import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import dev.avernic.server.engine.net.game.ServerPacket
import io.guthix.buffer.writeByteNeg
import io.netty.buffer.ByteBuf

@ServerPacket(opcode = 69, type = PacketType.FIXED)
class UpdateVarpSmall(val id: Int, val value: Int) : Packet {
    companion object : Codec<UpdateVarpSmall> {
        override fun encode(session: Session, packet: UpdateVarpSmall, buf: ByteBuf) {
            buf.writeByteNeg(packet.value)
            buf.writeShortLE(packet.id)
        }
    }
}