package dev.avernic.server.engine.net.pipeline

import io.netty.channel.ChannelInitializer
import io.netty.channel.socket.SocketChannel

class GameChannelInitializer : ChannelInitializer<SocketChannel>() {

    override fun initChannel(ch: SocketChannel) {
        val handler = GameChannelHandler()
        val encoder = GameChannelEncoder(handler)
        val decoder = GameChannelDecoder(handler)

        ch.pipeline()
            .addLast("decoder", decoder)
            .addLast("encoder", encoder)
            .addLast("handler", handler)
    }

}