package dev.avernic.server.engine.game

import dev.avernic.server.engine.event.Event
import dev.avernic.server.engine.event.EventHandler
import dev.avernic.server.engine.event.EventSubject
import dev.avernic.server.engine.game.list.PlayerList
import dev.avernic.server.engine.task.Task
import dev.avernic.server.engine.task.TaskSubject
import dev.avernic.server.engine.task.TaskType
import java.util.concurrent.LinkedBlockingDeque

class World : EventSubject, TaskSubject {

    var tick: Long = 0L

    val players = PlayerList(MAX_PLAYERS)

    override val events = LinkedBlockingDeque<EventHandler<Event>>()

    override val tasks = mutableMapOf<TaskType, MutableSet<Task>>()

    /**
     * The game world cycle logic.
     */
    internal fun gameLogic() {
        // Process client packets
        players.forEach { it.client.processPackets() }

        // World
        processTasks()

        // Post
        postProcess()

        // Flush outbound client packets.
        players.forEach { it.client.flush() }

        tick++
    }

    private fun processTasks() {
        while(true) {
            while(events.isNotEmpty()) events.poll().handle()
            val resume = tasks.values.flatMap { it.toList().map(Task::run) }
            if(resume.all { !it } && events.isEmpty()) break
        }
    }

    companion object {

        /**
         * The maximum number of players allowed in the game world.
         */
        const val MAX_PLAYERS = 2048
    }
}