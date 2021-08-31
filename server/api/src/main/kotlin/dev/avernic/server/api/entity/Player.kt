package dev.avernic.server.api.entity

import dev.avernic.server.api.task.ChatTask
import dev.avernic.server.engine.game.MovementType
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.entity.update.PlayerUpdateFlag
import dev.avernic.server.engine.game.map.Tile

/**
 * Forces the player's appearance to update on the client's end if
 * the server side information has changed.
 *
 * @receiver Player
 */
fun Player.updateAppearance() {
    this.addAppearanceUpdateFlag()
}

/**
 * Forces a player to say a message to the public chat.
 *
 * @receiver Player
 * @param message String
 */
fun Player.forceChat(message: String) {
    this.chatMessage = message
    this.addForceChatUpdateFlag()
    cancelTasks(ChatTask)
    addTask(ChatTask) {
        wait(ticks = 3)
        addPostTask { chatMessage = null }
    }
}

/**
 * Forces the player to teleport to a given tile in the
 * game world.
 *
 * @receiver Player
 * @param tile Tile
 */
fun Player.teleport(tile: Tile) {
    this.teleportTile = tile
}