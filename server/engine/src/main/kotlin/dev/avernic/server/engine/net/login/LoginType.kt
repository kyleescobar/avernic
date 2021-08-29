package dev.avernic.server.engine.net.login

enum class LoginType(val opcode: Int) {
    NORMAL(16),
    RECONNECT(18);

    companion object {
        fun fromOpcode(opcode: Int) = values().first { it.opcode == opcode }
    }
}