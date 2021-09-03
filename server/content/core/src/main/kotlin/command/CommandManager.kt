package command

import dev.avernic.server.engine.event.on_event
import dev.avernic.server.engine.event.player.PlayerCommandEvent
import dev.avernic.server.engine.game.entity.Player
import org.tinylog.kotlin.Logger

object CommandManager {

    private val commands = mutableMapOf<String, Command>()

    init {
        /*
         * Listen for client command event and handle them.
         */
        on_event<PlayerCommandEvent> { event ->
            handleCommand(event.player, event.command, event.args)
        }
    }

    internal fun registerCommand(command: Command) {
        if(commands.containsKey(command.command)) {
            Logger.error("Failed to register command: '$command' as a command with that name already exists.")
            return
        }

        commands[command.command] = command
    }

    private fun handleCommand(player: Player, command: String, args: List<String>) {
        val node = this.commands[command] ?: return
        if(player.privilege < node.privilege) return
        node.action(player, args)
    }
}