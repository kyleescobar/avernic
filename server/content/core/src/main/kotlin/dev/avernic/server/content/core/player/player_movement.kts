import dev.avernic.server.engine.event.onEvent
import dev.avernic.server.engine.event.player.PlayerGameClickEvent
import dev.avernic.server.engine.task.NormalTask

onEvent<PlayerGameClickEvent> { event ->
    event.player.path.clear()
    event.player.path.addAll(
        event.player.pathfinder.calculatePath(
            start = event.player.tile,
            end = event.tile
        )
    )
    event.player.cancelTasks(NormalTask)
}