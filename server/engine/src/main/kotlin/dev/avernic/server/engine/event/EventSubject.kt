package dev.avernic.server.engine.event

interface EventSubject {

    val events: MutableCollection<EventHandler<Event>>

}