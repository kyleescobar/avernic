package dev.avernic.server.engine.event

import dev.avernic.server.engine.game.entity.Player

abstract class PlayerEvent(val player: Player) : WorldEvent()

fun <E : PlayerEvent> EventBus.dispatch(event: E) {
    eventListeners[event::class]?.let {
        it.forEach { listener -> listener.schedule(event, event.player) }
    }
}