package player

import dev.avernic.server.api.Varbits
import dev.avernic.server.config.ServerConfig
import dev.avernic.server.engine.api.toggleRun
import dev.avernic.server.engine.api.updateAppearance
import dev.avernic.server.engine.event.on_event
import dev.avernic.server.engine.event.player.LoginEvent

/**
 * Handle the player initialization upon login.
 */
on_event<LoginEvent> { event ->
    val player = event.player

    player.updateAppearance()
    player.toggleRun()

    /*
     * Send default initial client scripts and vars.
     */
    player.updateVarbit(Varbits.HAS_DISPLAY_NAME, 1)

    /*
     * Send welcome game message.
     */
    player.sendGameMessage("Welcome to ${ServerConfig.SERVER_NAME}.")
}