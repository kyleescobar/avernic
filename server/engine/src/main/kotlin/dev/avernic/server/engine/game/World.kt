package dev.avernic.server.engine.game

import dev.avernic.server.engine.event.Event
import dev.avernic.server.engine.event.EventHandler
import dev.avernic.server.engine.event.EventSubject
import dev.avernic.server.engine.game.list.PlayerList
import dev.avernic.server.engine.game.map.Chunk
import dev.avernic.server.engine.task.Task
import dev.avernic.server.engine.task.TaskSubject
import dev.avernic.server.engine.task.TaskType
import org.tinylog.kotlin.Logger
import java.util.concurrent.LinkedBlockingDeque

class World : EventSubject, TaskSubject {

    var tick: Long = 0L

    val players = PlayerList(MAX_PLAYERS)

    override val events = LinkedBlockingDeque<EventHandler<Event>>()

    override val tasks = mutableMapOf<TaskType, MutableSet<Task>>()

    internal val chunks = Array(MAX_PLANES) { Array(2048) { arrayOfNulls<Chunk?>(2048) } }

    internal fun initialize() {
        Logger.info("Preparing the game world...")

        /*
         * TODO: Load the region chunks from game cache + collision information
         */
    }

    /**
     * The game world cycle logic.
     */
    internal fun gameLogic() {
        // Process client packets
        players.forEach { it.client.processPackets() }

        // World
        processTasks()

        // Player
        processPlayerTasks()
        processPlayerMovement()

        // Sync
        synchronize()

        // Post
        postProcess()

        tick++
    }

    private fun processTasks() {
        while(true) {
            while(events.isNotEmpty()) events.poll().handle()
            val resume = tasks.values.flatMap { it.toList().map(Task::run) }
            if(resume.all { !it } && events.isEmpty()) break
        }
    }

    private fun processPlayerTasks() {
        players.forEach { it.processTasks() }
    }

    private fun processPlayerMovement() {
        players.forEach { it.processMovement() }
    }

    private fun synchronize() {
        players.forEach { it.synchronize() }
        players.forEach { it.postProcess() }
    }

    companion object {

        /**
         * The maximum number of players allowed in the game world.
         */
        const val MAX_PLAYERS = 2048

        /**
         * The maximum number of planes or height levels the world supports.
         */
        const val MAX_PLANES = 4
    }
}