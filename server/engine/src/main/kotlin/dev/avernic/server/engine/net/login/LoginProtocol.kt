package dev.avernic.server.engine.net.login

import dev.avernic.server.common.inject
import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.Protocol
import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.service.ServiceManager
import dev.avernic.server.engine.service.login.LoginService
import io.netty.buffer.ByteBuf

class LoginProtocol(session: Session) : Protocol(session) {

    private val serviceManager: ServiceManager by inject()
    private val loginService = serviceManager[LoginService::class]

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

        /*
         * Queue the login request for processing.
         */
        loginService.queueLoginRequest(message)
    }
}