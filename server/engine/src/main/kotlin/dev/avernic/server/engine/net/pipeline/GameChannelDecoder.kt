package dev.avernic.server.engine.net.pipeline

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder

class GameChannelDecoder(private val handler: GameChannelHandler) : ByteToMessageDecoder() {

    override fun decode(ctx: ChannelHandlerContext, buf: ByteBuf, out: MutableList<Any>) {
        val session = handler.session.get()
        val protocol = session.protocol.get()
        val message = protocol.decode(buf, out)
        out.add(message)
    }
}