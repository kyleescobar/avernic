import dev.avernic.server.engine.event.onEvent
import dev.avernic.server.engine.event.player.PlayerGameClickEvent
import dev.avernic.server.engine.game.entity.pathfinder.destination.TileDestination
import dev.avernic.server.engine.task.NormalTask

onEvent<PlayerGameClickEvent> { event ->
    val player = event.player
    val dest = TileDestination(event.tile.x, event.tile.y)
    player.path = player.pathfinder.calculatePath(player.tile, dest)
    player.cancelTasks(NormalTask)
}