import api.teleport
import api.toggleNoClip
import command.on_command
import dev.avernic.server.api.Npcs
import dev.avernic.server.api.game.findPlayer
import dev.avernic.server.engine.game.Privilege
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.map.Tile
import kotlin.reflect.full.memberProperties

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

/**
 * Spawns a NPC with a given name from [Npcs] or a NPC id.
 */
on_command("npc", privilege = Privilege.ADMINISTRATOR) { player, args ->
    if(args.size != 1) {
        player.sendGameMessage("<col=ff0000>Command Usage: ::npc <npc_name|npc_id>")
        return@on_command
    }

    val npcId = when(args.first().isNumber()) {
        true -> args.first().toInt()
        false -> getNpcIdFromName(args.first())
    } ?: run {
        player.sendGameMessage("<col=ff0000>Could not find an NPC with the name: ${args.first()}.")
        return@on_command
    }

    player.world.spawnNpc(npcId, player.tile)
    player.sendGameMessage("<col=0000ff>Spawned a NPC with ID: $npcId at your location.")
}

/**
 * Teleports your self to a provided tile coordinate in the world.
 */
on_command("tele", privilege = Privilege.MODERATOR) { player, args ->
    if(args.size < 2) {
        player.sendGameMessage("<col=ff0000>Command Usage: ::tele <x> <y> [plane]</col>")
        return@on_command
    }

    val x = args[0].let {
        if(it == "~") player.tile.x
        else if(it.startsWith("~")) player.tile.x + it.substring(1).toInt()
        else it.toInt()
    }

    val y = args[1].let {
        if(it == "~") player.tile.y
        else if(it.startsWith("~")) player.tile.y + it.substring(1).toInt()
        else it.toInt()
    }


    val plane = if(args.size == 3) {
        args[2].let {
            if(it == "~") player.tile.plane
            else if(it.startsWith("~")) player.tile.plane + it.substring(1).toInt()
            else it.toInt()
        }
    } else {
        player.tile.plane
    }

    player.teleport(Tile(x, y, plane))
    player.sendGameMessage("<col=0000ff>You have teleported to tile: [x: $x, y: $y, plane: $plane].")
}

/**
 * Teleports your player to a given target player's tile by their username or display name
 */
on_command("teleto", privilege = Privilege.MODERATOR) { player, args ->
    if(args.isEmpty()) {
        player.sendGameMessage("<col=ff0000>Command Usage: ::teleto <player></col>")
        return@on_command
    }

    val targetPlayer = player.world.findPlayer(args.first()) ?: run {
        player.sendGameMessage("<col=ff0000>Could not find online player with name: ${args.first()}.")
        return@on_command
    }

    player.teleport(targetPlayer.tile)
    player.sendGameMessage("<col=0000ff>You have teleported to player: ${targetPlayer.displayName}.")
}

/**
 * Teleports a target player by their username or display name to your player's tile.
 */
on_command("teleme", privilege = Privilege.MODERATOR) { player, args ->
    if(args.isEmpty()) {
        player.sendGameMessage("<col=ff0000>Command Usage: ::teleme <player></col>")
        return@on_command
    }

    val targetPlayer = player.world.findPlayer(args.first()) ?: run {
        player.sendGameMessage("<col=ff0000>Could not find online player with name: ${args.first()}.")
        return@on_command
    }

    targetPlayer.teleport(player.tile)
    player.sendGameMessage("<col=0000ff>You have teleported player: ${targetPlayer.displayName} to your location..")
}

fun Player.sendStateMessage(state: Boolean) {
    val formatted = when(state) {
        true -> "<col=00ff00>ENABLED</col>"
        false -> "<col=ff0000>DISABLED</col>"
    }
    this.sendGameMessage("No-Clip Mode: $formatted")
}

fun String.isNumber(): Boolean = try {
    this.toInt()
    true
} catch (e : NumberFormatException) {
    false
}

fun getNpcIdFromName(name: String): Int? {
    val npcsClass = Npcs::class
    val field = npcsClass.memberProperties.firstOrNull { it.name.uppercase() == name }
    return field?.get(npcsClass.objectInstance!!) as Int?
}