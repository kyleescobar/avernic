package dev.avernic.server.engine.net.packet.server

import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import dev.avernic.server.engine.net.game.ServerPacket
import io.netty.buffer.ByteBuf

@ServerPacket(opcode = 27, type = PacketType.FIXED)
class UpdateRunEnergy(val energy: Int) : Packet {
    companion object : Codec<UpdateRunEnergy> {
        override fun encode(session: Session, packet: UpdateRunEnergy, buf: ByteBuf) {
            buf.writeByte(packet.energy)
        }
    }
}