package dev.avernic.server.engine.event

import kotlin.reflect.KClass

@DslMarker
annotation class EventDslMarker

@DslMarker
annotation class EventDslConditionMarker

@DslMarker
annotation class EventDslActionMarker

@EventDslMarker
inline fun <reified E : Event> onEvent(): EventAction<E> = EventAction(E::class)

class EventAction<E : Event>(private val type: KClass<E>) {

    private var condition: E.() -> Boolean = { true }

    @EventDslConditionMarker
    fun where(condition: E.() -> Boolean): EventAction<E> {
        this.condition = condition
        return this
    }

    @EventDslActionMarker
    fun then(action: E.() -> Unit): EventListener<E> = EventListener(type, condition, action)
}