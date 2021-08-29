package dev.avernic.server.engine.net.login

import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.Protocol
import dev.avernic.server.engine.net.Session
import io.netty.buffer.ByteBuf

class LoginProtocol(session: Session) : Protocol(session) {

    private val decoder = LoginDecoder(session)
    private val encoder = LoginEncoder(session)

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        decoder.decode(buf, out)
    }

    override fun encode(message: Message, out: ByteBuf) {
        encoder.encode(message, out)
    }

    override fun handle(message: Message) {
        if(message !is LoginRequest) return
        println(message)
    }
}