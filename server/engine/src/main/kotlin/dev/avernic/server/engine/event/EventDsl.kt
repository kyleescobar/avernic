package dev.avernic.server.engine.event

import kotlin.reflect.KClass

@DslMarker
annotation class EventDslMarker

@DslMarker
annotation class EventDslConditionMarker

@DslMarker
annotation class EventDslActionMarker

@EventDslMarker
inline fun <reified E : Event> onEvent(noinline action: ((E) -> Unit)? = null) = EventAction(E::class, action).build()

class EventAction<E : Event>(private val type: KClass<E>, private val action: ((E) -> Unit)?) {

    private var condition: E.() -> Boolean = { true }

    fun build(): EventAction<E> {
        if(action != null) {
            EventListener(type, condition, action)
        }
        return this
    }

    @EventDslConditionMarker
    fun where(condition: E.() -> Boolean): EventAction<E> {
        this.condition = condition
        return this
    }

    @EventDslActionMarker
    fun then(action: E.() -> Unit): EventListener<E> = EventListener(type, condition, action)
}