package dev.avernic.server.engine.net.packet.client

import dev.avernic.server.engine.event.EventBus
import dev.avernic.server.engine.event.player.packet.MinimapClickEvent
import dev.avernic.server.engine.event.dispatch
import dev.avernic.server.engine.game.map.Tile
import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.ClientPacket
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import io.guthix.buffer.readUnsignedShortAddLE
import io.netty.buffer.ByteBuf

@ClientPacket(opcode = 23, type = PacketType.VARIABLE_BYTE)
class MoveMinimapClick(
    val tileX: Int,
    val tileY: Int,
    val type: Int
) : Packet {

    override fun handle(session: Session) {
        val player = session.client.player
        val tile = Tile(tileX, tileY, player.tile.plane)
        EventBus.dispatch(MinimapClickEvent(player, tile))
    }

    companion object : Codec<MoveMinimapClick> {
        override fun decode(session: Session, buf: ByteBuf): MoveMinimapClick {
            val tileX = buf.readUnsignedShortAddLE()
            val tileY = buf.readUnsignedShort()
            val type = buf.readUnsignedByte().toInt()
            buf.skipBytes(Byte.SIZE_BYTES) // mouseX
            buf.skipBytes(Byte.SIZE_BYTES) // mouseY
            buf.skipBytes(Short.SIZE_BYTES) // cameraAngleY
            buf.skipBytes(Byte.SIZE_BYTES * 4) // IDK
            buf.skipBytes(Short.SIZE_BYTES) // playerX
            buf.skipBytes(Short.SIZE_BYTES) // playerY
            buf.skipBytes(Byte.SIZE_BYTES)
            return MoveMinimapClick(tileX, tileY, type)
        }
    }
}