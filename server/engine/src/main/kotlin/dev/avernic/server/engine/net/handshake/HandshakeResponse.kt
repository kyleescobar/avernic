package dev.avernic.server.engine.net.handshake

import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.StatusResponse

data class HandshakeResponse(val status: StatusResponse, val seed: Long) : Message