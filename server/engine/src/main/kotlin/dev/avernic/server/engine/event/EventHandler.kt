package dev.avernic.server.engine.event

import org.tinylog.kotlin.Logger

class EventHandler<out E : Event>(
    val event: E,
    private val action: E.() -> Unit
) {

    fun handle(): Unit = try {
        event.action()
    } catch (e : Exception) {
        Logger.error(e) { "An error occurred while handling event $event." }
    }
}