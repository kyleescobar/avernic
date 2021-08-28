package dev.avernic.server.engine.net.handshake

enum class HandshakeType(val opcode: Int) {
    LOGIN(opcode = 14),
    JS5(opcode = 15);

    companion object {
        fun fromOpcode(opcode: Int) = values().first { it.opcode == opcode }
    }
}