package dev.avernic.server.engine.net.game

import dev.avernic.server.engine.net.Session
import io.netty.buffer.ByteBuf

interface Codec<T : Packet> {

    fun encode(session: Session, packet: T, buf: ByteBuf) {
        throw UnsupportedOperationException()
    }

    fun decode(session: Session, buf: ByteBuf): T {
        throw UnsupportedOperationException()
    }

}