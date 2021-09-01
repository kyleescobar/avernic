package dev.avernic.server.engine.net.packet.client

import dev.avernic.server.engine.event.EventBus
import dev.avernic.server.engine.event.player.CommandEvent
import dev.avernic.server.engine.event.schedule
import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.ClientPacket
import dev.avernic.server.engine.net.game.Codec
import dev.avernic.server.engine.net.game.Packet
import dev.avernic.server.engine.net.game.PacketType
import io.guthix.buffer.readStringCP1252
import io.netty.buffer.ByteBuf

@ClientPacket(opcode = 103, type = PacketType.VARIABLE_BYTE)
class ClientCheat(val command: String, val args: List<String>) : Packet {

    override fun handle(session: Session) {
        EventBus.schedule(CommandEvent(session.client.player, command, args))
    }

    companion object : Codec<ClientCheat> {
        override fun decode(session: Session, buf: ByteBuf): ClientCheat {
            val raw = buf.readStringCP1252().split(" ")
            val command = raw.first()
            val args = raw.drop(1).toList()
            return ClientCheat(command, args)
        }
    }
}