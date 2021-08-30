package dev.avernic.server.engine.game.interf

enum class DisplayMode(val id: Int, val enumId: Int) {
    FIXED(id = 548, enumId = 1129),
    RESIZABLE_CLASSIC(id = 161, enumId = 1130),
    RESIZABLE_MODERN(id = 164, enumId = 1131),
    FULLSCREEN(id = 165, enumId = 1132),
    MOBILE(id = 601, enumId = 1745);

    companion object {
        fun fromId(id: Int): DisplayMode = values().first { it.id == id }
    }
}