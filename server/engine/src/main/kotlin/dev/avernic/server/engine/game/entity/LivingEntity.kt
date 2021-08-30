package dev.avernic.server.engine.game.entity

import dev.avernic.server.common.inject
import dev.avernic.server.engine.event.Event
import dev.avernic.server.engine.event.EventHandler
import dev.avernic.server.engine.event.EventSubject
import dev.avernic.server.engine.game.MovementType
import dev.avernic.server.engine.game.Size
import dev.avernic.server.engine.game.World
import dev.avernic.server.engine.game.entity.update.UpdateFlag
import dev.avernic.server.engine.game.map.Tile
import dev.avernic.server.engine.task.Task
import dev.avernic.server.engine.task.TaskSubject
import dev.avernic.server.engine.task.TaskType
import java.util.*
import java.util.concurrent.ConcurrentLinkedDeque

abstract class LivingEntity : Entity, EventSubject, TaskSubject {

    val world: World by inject()

    override var index: Int = -1
    override var size: Size = Size(width = 1, height = 1)
    override var tile: Tile = Tile(0, 0, 0)
    open var prevTile: Tile = Tile(0, 0, 0)
    override var orientation: Int = 0
    open var running: Boolean = false
    open var interacting: LivingEntity? = null
    open var movementType: MovementType = MovementType.NONE
    open var combatLevel: Int = 1

    abstract val updateFlags: SortedSet<out UpdateFlag>

    override val events = ConcurrentLinkedDeque<EventHandler<Event>>()

    override val tasks = mutableMapOf<TaskType, MutableSet<Task>>()

    internal val postTasks = mutableListOf<() -> Unit>()

    internal fun processTasks() {
        while(true) {
            while(events.isNotEmpty()) events.poll().handle()
            val resume = tasks.values.flatMap { it.toList().map(Task::run) }
            if(resume.all { !it } && events.isEmpty()) break
        }
    }

    override fun postProcess() {
        super.postProcess()
        updateFlags.clear()
        postTasks.forEach { it.invoke() }
        postTasks.clear()
        movementType = MovementType.NONE
    }
}