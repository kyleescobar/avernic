package dev.avernic.server.engine.net.handshake

import dev.avernic.server.config.ServerConfig
import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.Protocol
import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.StatusResponse
import dev.avernic.server.engine.net.js5.JS5Protocol
import dev.avernic.server.engine.net.login.LoginProtocol
import io.netty.buffer.ByteBuf

class HandshakeProtocol(session: Session) : Protocol(session) {

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        val request = when(HandshakeType.fromOpcode(buf.readUnsignedByte().toInt())) {
            HandshakeType.JS5 -> HandshakeRequest.JS5(revision = buf.readInt())
            HandshakeType.LOGIN -> HandshakeRequest.LOGIN
        }
        out.add(request)
    }

    override fun encode(message: Message, out: ByteBuf) {
        if(message !is HandshakeResponse) return

        out.writeByte(message.status.opcode)
        out.writeLong(message.seed)
    }

    override fun handle(message: Message) {
        when(message) {
            is HandshakeRequest.JS5 -> message.handle()
            is HandshakeRequest.LOGIN -> message.handle()
        }
    }

    private fun HandshakeRequest.JS5.handle() {
        if(revision != ServerConfig.REVISION) {
            session.writeAndClose(StatusResponse.OUT_OF_DATE)
            return
        }

        session.protocol.set(JS5Protocol(session))
        session.writeAndFlush(StatusResponse.SUCCESSFUL)
    }

    private fun HandshakeRequest.LOGIN.handle() {
        val response = HandshakeResponse(StatusResponse.SUCCESSFUL, session.seed)
        session.writeAndFlush(response)
        session.protocol.set(LoginProtocol(session))
    }
}