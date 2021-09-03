package player

import api.toggleRun
import api.updateAppearance
import dev.avernic.server.api.Varbits
import dev.avernic.server.config.ServerConfig
import dev.avernic.server.engine.event.on_event
import dev.avernic.server.engine.event.player.PlayerLoginEvent
import dev.avernic.server.engine.game.Direction
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.interf.DisplayMode
import dev.avernic.server.engine.game.interf.GameInterface

/**
 * Handle the player initialization upon login.
 */
on_event<PlayerLoginEvent> { event ->
    val player = event.player

    player.updateAppearance()
    player.toggleRun()

    /*
     * Send default initial client scripts and vars.
     */
    player.updateVarbit(Varbits.HAS_DISPLAY_NAME, 1)
    player.runEnergy = 20

    /*
     * Send welcome game message.
     */
    player.sendGameMessage("Welcome to ${ServerConfig.SERVER_NAME}.")

    /*
     * Open the login interface for the player.
     */
    //player.openLoginInterface()
}

fun Player.openLoginInterface() {
    interfaces.openTopInterface(DisplayMode.FULLSCREEN.id)

    /*
     * Open the components for the login interface.
     */
    interfaces.openInterface(1, GameInterface.CHAT_BOX)
    interfaces.openInterface(2, GameInterface.UNKNOWN1)
    interfaces.openInterface(25, GameInterface.USERNAME)
    interfaces.openInterface(26, GameInterface.MINI_MAP)
    interfaces.openInterface(29, GameInterface.UNKNOWN2)
    interfaces.openInterface(11, GameInterface.SKILLS)
    interfaces.openInterface(12, GameInterface.QUESTS)
    interfaces.openInterface(13, GameInterface.INVENTORY)
    interfaces.openInterface(14, GameInterface.EQUIPMENT)
    interfaces.openInterface(15, GameInterface.PRAYER)
    interfaces.openInterface(16, GameInterface.SPELL_BOOK)
    interfaces.openInterface(19, GameInterface.SOCIAL)
    interfaces.openInterface(18, GameInterface.ACCOUNT)
    interfaces.openInterface(20, GameInterface.LOG_OUT)
    interfaces.openInterface(22, GameInterface.EMOTES)
    interfaces.openInterface(23, GameInterface.MUSIC)
    interfaces.openInterface(10, GameInterface.COMBAT)

    runClientScript(233, -1, 2100, 0, 1897, 330, -200, -200, 5, 28238, 24772664)
    runClientScript(233, 8446, 1200, 0, 177, 1999, 0, 0, 38593, 24772665)
}