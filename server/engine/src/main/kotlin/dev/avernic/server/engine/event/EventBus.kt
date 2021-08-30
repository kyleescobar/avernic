package dev.avernic.server.engine.event

import kotlin.reflect.KClass

object EventBus {

    internal val eventListeners = mutableMapOf<KClass<out Event>, MutableList<EventListener<Event>>>()

    @Suppress("UNCHECKED_CAST")
    fun <E : Event> register(type: KClass<E>, listener: EventListener<E>) {
        val listeners = eventListeners.getOrPut(type, ::mutableListOf)
        listeners.add(listener as EventListener<Event>)
    }

}