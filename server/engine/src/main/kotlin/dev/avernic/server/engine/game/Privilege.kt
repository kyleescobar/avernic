package dev.avernic.server.engine.game

enum class Privilege(val id: Int) {
    PLAYER(id = 0),
    MODERATOR(id = 1),
    ADMINISTRATOR(id = 2);

    companion object {
        fun fromId(id: Int): Privilege = values().first { it.id == id }
    }
}