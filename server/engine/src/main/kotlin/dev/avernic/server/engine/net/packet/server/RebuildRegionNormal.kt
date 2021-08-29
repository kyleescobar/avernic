package dev.avernic.server.engine.net.packet.server

import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import dev.avernic.server.engine.net.game.ServerPacket
import io.guthix.buffer.writeStringCP1252
import io.netty.buffer.ByteBuf

@ServerPacket(opcode = 2, type = PacketType.VARIABLE_SHORT)
class RebuildRegionNormal(val player: Player, val gpi: Boolean = false) : Packet {
    companion object : Codec<RebuildRegionNormal> {
        override fun encode(session: Session, packet: RebuildRegionNormal, buf: ByteBuf) {
            buf.writeStringCP1252("fdlkjsfakldjfaslkfjdsklafjdsaklfjaklsjfdsklafjdslkafjsdklafdsalkfjdlk")
        }
    }
}