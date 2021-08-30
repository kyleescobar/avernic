package dev.avernic.server.engine.task.condition

import kotlin.coroutines.Continuation

class TaskContinuation(
    val condition: TaskCondition,
    val continuation: Continuation<Unit>
) : TaskCondition by condition