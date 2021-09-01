import dev.avernic.server.engine.api.walkTo
import dev.avernic.server.engine.event.onEvent
import dev.avernic.server.engine.event.player.GameClickEvent
import dev.avernic.server.engine.event.player.MinimapClickEvent

/**
 * Handle when the player clicks inside the game canvas.
 */
onEvent<GameClickEvent> { event ->
    event.player.walkTo(event.tile)
}

/**
 * Handle when the player clicks on the minimap.
 */
onEvent<MinimapClickEvent> { event ->
    event.player.walkTo(event.tile)
}