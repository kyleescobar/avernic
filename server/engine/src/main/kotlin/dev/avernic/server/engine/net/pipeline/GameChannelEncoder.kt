package dev.avernic.server.engine.net.pipeline

import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.StatusResponse
import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.MessageToByteEncoder

class GameChannelEncoder(private val handler: GameChannelHandler) : MessageToByteEncoder<Message>() {

    override fun encode(ctx: ChannelHandlerContext, msg: Message, out: ByteBuf) {
        val session = handler.session.get()
        val protocol = session.protocol.get()

        if(msg is StatusResponse) {
            out.writeByte(msg.opcode)
        } else {
            protocol.encode(msg, out)
        }
    }
}