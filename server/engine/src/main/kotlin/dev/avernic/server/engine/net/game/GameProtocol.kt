package dev.avernic.server.engine.net.game

import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.Protocol
import dev.avernic.server.engine.net.Session
import io.netty.buffer.ByteBuf

class GameProtocol(session: Session) : Protocol(session) {

    override fun encode(message: Message, out: ByteBuf) {

    }

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {

    }

    override fun handle(message: Message) {

    }

}