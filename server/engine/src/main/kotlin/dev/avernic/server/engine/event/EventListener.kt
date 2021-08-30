package dev.avernic.server.engine.event

import kotlin.reflect.KClass

class EventListener<in E : Event>(
    type: KClass<E>,
    private val condition: E.() -> Boolean,
    private val action: E.() -> Unit
) {

    init {
        EventBus.register(type, this)
    }

    internal fun execute(event: E) {
        if(event.condition()) {
            val handler = EventHandler(event, action)
            handler.handle()
        }
    }

    internal fun schedule(event: E, subject: EventSubject) {
        if(event.condition()) {
            val handler = EventHandler(event, action)
            subject.events.add(handler)
        }
    }

}