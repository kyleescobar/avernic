import command.on_command
import dev.avernic.server.api.game.findPlayer
import dev.avernic.server.engine.api.toggleNoClip
import dev.avernic.server.engine.game.Privilege
import dev.avernic.server.engine.game.entity.Player

/**
 * Toggle noclip mode.
 */
on_command(command = "noclip", privilege = Privilege.ADMINISTRATOR) { player, args ->
    if(args.isEmpty()) {
        player.toggleNoClip()
        player.sendStateMessage(player.noclip)
    } else {
        val targetPlayer = player.world.findPlayer(args.first()) ?: run {
            player.sendGameMessage("<col=ff0000>Unable to find player '${args.first()}'. Make sure the player is online.</col>")
            return@on_command
        }

        targetPlayer.toggleNoClip()
        player.sendStateMessage(targetPlayer.noclip)
    }
}

fun Player.sendStateMessage(state: Boolean) {
    val formatted = when(state) {
        true -> "<col=00ff00>ENABLED</col>"
        false -> "<col=ff0000>DISABLED</col>"
    }
    this.sendGameMessage("No-Clip Mode: $formatted")
}