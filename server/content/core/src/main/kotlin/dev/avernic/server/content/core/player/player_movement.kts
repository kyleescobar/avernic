import dev.avernic.server.api.entity.teleport
import dev.avernic.server.engine.event.onEvent
import dev.avernic.server.engine.event.player.PlayerGameClickEvent

onEvent<PlayerGameClickEvent> { event ->
    event.player.teleport(event.tile)
}