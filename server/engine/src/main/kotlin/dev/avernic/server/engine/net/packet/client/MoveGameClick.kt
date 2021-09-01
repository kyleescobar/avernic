package dev.avernic.server.engine.net.packet.client

import dev.avernic.server.engine.event.EventBus
import dev.avernic.server.engine.event.player.GameClickEvent
import dev.avernic.server.engine.event.schedule
import dev.avernic.server.engine.game.map.Tile
import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.ClientPacket
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import io.guthix.buffer.readUnsignedShortAddLE
import io.netty.buffer.ByteBuf

@ClientPacket(opcode = 19, type = PacketType.VARIABLE_BYTE)
class MoveGameClick(
    val tileX: Int,
    val tileY: Int,
    val type: Int
) : Packet {
    override fun handle(session: Session) {
        val tile = Tile(tileX, tileY, session.client.player.tile.plane)
        EventBus.schedule(GameClickEvent(session.client.player, tile))
    }

    companion object : Codec<MoveGameClick> {
        override fun decode(session: Session, buf: ByteBuf): MoveGameClick {
            val tileX = buf.readUnsignedShortAddLE()
            val tileY = buf.readUnsignedShort()
            val type = buf.readUnsignedByte().toInt()
            return MoveGameClick(tileX, tileY, type)
        }
    }
}