import dev.avernic.server.engine.event.onEvent
import dev.avernic.server.engine.event.player.PlayerGameClickEvent
import dev.avernic.server.engine.game.entity.pathfinder.dest.Destination
import dev.avernic.server.engine.game.entity.pathfinder.dest.DestinationTile
import dev.avernic.server.engine.task.NormalTask

onEvent<PlayerGameClickEvent> { event ->
    val player = event.player
    val dest = DestinationTile(event.tile.x, event.tile.y, event.tile.plane)
    player.path = player.pathfinder.calculatePath(player.tile, dest)
    player.cancelTasks(NormalTask)
}