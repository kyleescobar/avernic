import dev.avernic.server.api.entity.forceChat
import dev.avernic.server.engine.event.onEvent
import dev.avernic.server.engine.event.player.PlayerLoginEvent

onEvent<PlayerLoginEvent> { event ->
    event.player.forceChat("Hello World")
}