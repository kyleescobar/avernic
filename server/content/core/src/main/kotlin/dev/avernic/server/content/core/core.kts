import dev.avernic.server.api.Varbits
import dev.avernic.server.engine.api.toggleRun
import dev.avernic.server.engine.api.updateAppearance
import dev.avernic.server.engine.event.onEvent
import dev.avernic.server.engine.event.player.LoginEvent

/**
 * Handle the player initialization upon login.
 */
onEvent<LoginEvent> { event ->
    val player = event.player

    player.updateAppearance()
    player.toggleRun()

    /*
     * Send default initial client scripts and vars.
     */
    player.updateVarbit(Varbits.HAS_DISPLAY_NAME, 1)
}