package command

import dev.avernic.server.engine.game.Privilege
import dev.avernic.server.engine.game.entity.Player

@DslMarker
annotation class CommandDslMarker

@Suppress("FunctionName")
@CommandDslMarker
fun on_command(
    command: String,
    privilege: Privilege = Privilege.PLAYER,
    action: (player: Player, args: List<String>) -> Unit
) {
    val node = Command(command, privilege, action)
    CommandManager.registerCommand(node)
}