package command

import dev.avernic.server.engine.game.Privilege
import dev.avernic.server.engine.game.entity.Player

data class Command(
    val command: String,
    val privilege: Privilege,
    val action: (player: Player, args: List<String>) -> Unit
)