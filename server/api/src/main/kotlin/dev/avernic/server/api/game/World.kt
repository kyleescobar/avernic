package dev.avernic.server.api.game

import dev.avernic.server.engine.game.MessageType
import dev.avernic.server.engine.game.World
import dev.avernic.server.engine.game.entity.Player

/**
 * Finds a player that is online and register in the world by their username or display-name.
 *
 * @receiver World
 * @param username String
 * @return Player?
 */
fun World.findPlayer(username: String): Player? =
    this.players.firstOrNull { it.username == username || it.displayName == username }

/**
 * Sends a broadcast message to all players in the world.
 *
 * @receiver World
 * @param message String
 */
fun World.broadcast(message: String) {
    this.players.forEach { player ->
        player.sendGameMessage(message, MessageType.BROADCAST)
    }
}