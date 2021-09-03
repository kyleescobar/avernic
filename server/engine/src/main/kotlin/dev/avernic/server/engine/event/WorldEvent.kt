package dev.avernic.server.engine.event

import dev.avernic.server.common.inject
import dev.avernic.server.engine.game.World

abstract class WorldEvent : Event {
    val world: World by inject()
}

fun <E : WorldEvent> EventBus.dispatch(event: E) {
    eventListeners[event::class]?.let {
        it.forEach { listener -> listener.schedule(event, event.world) }
    }
}