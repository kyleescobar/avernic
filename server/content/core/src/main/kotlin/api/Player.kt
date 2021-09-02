package api

import dev.avernic.server.api.Varps
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
    queue {
        wait(ticks = 3)
        doLater { chatMessage = null }
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
 * Toggles the player's no-clip state.
 *
 * @receiver Player
 */
fun Player.toggleNoClip() {
    this.noclip = !noclip
}

/**
 * Toggles the player's running state.
 *
 * @receiver Player
 */
fun Player.toggleRun() {
    running = !running
    updateVarp(Varps.RUN_STATE, if(running) 1 else 0)
}

fun Player.drainRunEnergy() {
    runEnergy -= 1
}

fun Player.recoverRunEnergy() {
    runEnergy += 1
}