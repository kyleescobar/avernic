package dev.avernic.server.engine.net.game

import io.netty.buffer.ByteBuf

class PacketDecoder(private val protocol: GameProtocol) {

    fun decode(buf: ByteBuf, out: MutableList<Any>) {
        /*
         * Not yet implemented.
         */
    }

}