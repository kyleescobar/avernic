package dev.avernic.server.engine.task

import dev.avernic.server.engine.task.condition.TaskContinuation
import dev.avernic.server.engine.task.condition.TaskEmptyCondition
import kotlin.coroutines.intrinsics.createCoroutineUnintercepted

interface TaskSubject {

    val tasks: MutableMap<TaskType, MutableSet<Task>>

    fun addTask(type: TaskType = TaskType.NORMAL, action: suspend Task.() -> Unit): Task {
        val task = Task(type, this)
        task.next = TaskContinuation(TaskEmptyCondition, action.createCoroutineUnintercepted(task, task))
        tasks.getOrPut(type) { mutableSetOf() }.add(task)
        return task
    }

    fun cancelTasks(type: TaskType) {
        tasks[type]?.forEach { it.cancel() }
    }

    fun postProcess() {
        tasks.values.forEach { it.forEach(Task::postProcess) }
    }

}