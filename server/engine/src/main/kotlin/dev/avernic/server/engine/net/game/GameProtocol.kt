package dev.avernic.server.engine.net.game

import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.Protocol
import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.packet.client.EmptyPacket
import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled

class GameProtocol(session: Session) : Protocol(session) {

    private val encoder = PacketEncoder(this)
    private val decoder = PacketDecoder(this)

    override fun encode(message: Message, out: ByteBuf) {
        if(message !is Packet) return
        encoder.encode(message, out)
    }

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        if(buf.readableBytes() > 0) {
            decoder.decode(buf, out)
        } else {
            val codec = GamePackets.CLIENT.getCodec(-1)
            val packet = codec.decode(session, buf)
            out.add(packet)
        }
    }

    override fun handle(message: Message) {
        if(message !is Packet) return
        message.handle(session)
    }

}