import dev.avernic.server.api.entity.toggleRun
import dev.avernic.server.api.entity.updateAppearance
import dev.avernic.server.engine.event.onEvent
import dev.avernic.server.engine.event.player.LoginEvent

/**
 * Handle the player initialization upon login.
 */
onEvent<LoginEvent> { event ->
    /*
     * Update the local player's appearance to draw the local player.
     */
    event.player.updateAppearance()

    /*
     * Toggle the player's running mode on.
     */
    event.player.toggleRun()
}