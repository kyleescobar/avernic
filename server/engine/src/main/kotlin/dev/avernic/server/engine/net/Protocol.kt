package dev.avernic.server.engine.net

import io.netty.buffer.ByteBuf

abstract class Protocol(val session: Session) {

    open fun encode(message: Message, out: ByteBuf) {
        throw UnsupportedOperationException()
    }

    open fun decode(buf: ByteBuf, out: MutableList<Any>) {
        throw UnsupportedOperationException()
    }

    open fun handle(message: Message) {
        throw UnsupportedOperationException()
    }

}