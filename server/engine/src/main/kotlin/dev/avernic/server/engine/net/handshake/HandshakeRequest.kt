package dev.avernic.server.engine.net.handshake

import dev.avernic.server.engine.net.Message

sealed class HandshakeRequest : Message {
    object LOGIN : HandshakeRequest()
    class JS5(val revision: Int) : HandshakeRequest()
}