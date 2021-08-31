import dev.avernic.server.api.entity.updateAppearance
import dev.avernic.server.engine.event.onEvent
import dev.avernic.server.engine.event.player.PlayerLoginEvent

/**
 * Handle the player initialization upon login.
 */
onEvent<PlayerLoginEvent> { event ->
    event.player.updateAppearance()
    event.player.running = true
}