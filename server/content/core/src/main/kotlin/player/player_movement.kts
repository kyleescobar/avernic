package player

import api.walkTo
import dev.avernic.server.engine.event.on_event
import dev.avernic.server.engine.event.player.GameClickEvent
import dev.avernic.server.engine.event.player.MinimapClickEvent

/**
 * Handle when the player clicks inside the game canvas.
 */
on_event<GameClickEvent> { event ->
    event.player.walkTo(event.tile)
}

/**
 * Handle when the player clicks on the minimap.
 */
on_event<MinimapClickEvent> { event ->
    event.player.walkTo(event.tile)
}