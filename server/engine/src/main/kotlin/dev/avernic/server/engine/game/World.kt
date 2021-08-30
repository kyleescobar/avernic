package dev.avernic.server.engine.game

import dev.avernic.server.engine.game.list.PlayerList

class World {

    val players = PlayerList(MAX_PLAYERS)

    companion object {

        /**
         * The maximum number of players allowed in the game world.
         */
        const val MAX_PLAYERS = 2048
    }
}