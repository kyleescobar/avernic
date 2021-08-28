package dev.avernic.server.engine.net.js5

enum class JS5RequestType(val opcode: Int) {
    REQUEST_PRIORITY(0),
    REQUEST_NORMAL(1),
    GAME_INIT(2),
    GAME_LOADED(3),
    GAME_READY(6);

    companion object {
        fun fromOpcode(opcode: Int) = values().first { it.opcode == opcode }
    }
}