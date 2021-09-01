import command.on_command
import dev.avernic.server.api.game.findPlayer
import dev.avernic.server.engine.api.toggleNoClip
import dev.avernic.server.engine.game.Privilege

/**
 * Toggle noclip mode.
 */
on_command(command = "noclip", privilege = Privilege.ADMINISTRATOR) { player, args ->
    if(args.isEmpty()) {
        player.toggleNoClip()
    } else {
        val targetPlayer = player.world.findPlayer(args.first()) ?: return@on_command
        targetPlayer.toggleNoClip()
    }
}