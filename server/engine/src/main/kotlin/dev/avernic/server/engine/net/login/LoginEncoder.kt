package dev.avernic.server.engine.net.login

import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.Session
import io.netty.buffer.ByteBuf

class LoginEncoder(private val session: Session) {

    fun encode(message: Message, out: ByteBuf) {

    }

}