package dev.avernic.server.engine.api

import dev.avernic.server.engine.api.task.ChatTask
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.entity.pathfinder.destination.TileDestination
import dev.avernic.server.engine.game.map.Tile
import dev.avernic.server.engine.task.NormalTask

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

/**
 * Makes the player pathfinder and walk/navigate to a provided tile.
 *
 * @receiver Player
 * @param tile Tile
 */
fun Player.walkTo(tile: Tile) {
    val dest = TileDestination(tile.x, tile.y)
    this.path = this.pathfinder.calculatePath(this.tile, dest)
    this.cancelTasks(NormalTask)
}

/**
 * Toggle's a player's running state on or off.
 *
 * @receiver Player
 * @return Boolean
 */
fun Player.toggleRun() {
    this.running = !this.running
}

/**
 * Toggles the player's no-clip state.
 *
 * @receiver Player
 */
fun Player.toggleNoClip() {
    this.noclip = !noclip
}