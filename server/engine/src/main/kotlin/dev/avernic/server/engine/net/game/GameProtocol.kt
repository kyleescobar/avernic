package dev.avernic.server.engine.net.game

import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.Protocol
import dev.avernic.server.engine.net.Session
import io.netty.buffer.ByteBuf

class GameProtocol(session: Session) : Protocol(session) {

    private val encoder = PacketEncoder(this)
    private val decoder = PacketDecoder(this)

    override fun encode(message: Message, out: ByteBuf) {
        if(message !is Packet) return
        encoder.encode(message, out)
    }

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        decoder.decode(buf, out)
    }

    override fun handle(message: Message) {
        if(message !is Packet) return
        message.handle(session)
    }

}