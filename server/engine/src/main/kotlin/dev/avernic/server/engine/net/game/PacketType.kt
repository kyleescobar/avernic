package dev.avernic.server.engine.net.game

enum class PacketType(val length: Int) {
    FIXED(-3),
    VARIABLE_BYTE(-1),
    VARIABLE_SHORT(-2);

    companion object {
        fun fromLength(length: Int): PacketType = when(length) {
            -1 -> VARIABLE_BYTE
            -2 -> VARIABLE_SHORT
            else -> FIXED
        }
    }
}