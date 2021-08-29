package dev.avernic.server.engine.net.login

import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.Session
import io.netty.buffer.ByteBuf

class LoginEncoder(private val session: Session) {

    fun encode(message: Message, out: ByteBuf) {
        if(message !is LoginResponse) return

        out.writeByte(message.status.opcode)
        out.writeByte(13)
        out.writeByte(0)
        out.writeInt(0)
        out.writeByte(message.player.privilege.id)
        out.writeBoolean(message.player.privilege.id >= 1)
        out.writeShort(message.player.index)
        out.writeBoolean(message.player.member)
    }

}