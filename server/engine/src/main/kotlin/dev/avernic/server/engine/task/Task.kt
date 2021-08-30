package dev.avernic.server.engine.task

import dev.avernic.server.engine.task.condition.*
import org.tinylog.kotlin.Logger
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.resume
import kotlin.coroutines.intrinsics.createCoroutineUnintercepted
import kotlin.coroutines.intrinsics.suspendCoroutineUninterceptedOrReturn
import kotlin.coroutines.intrinsics.COROUTINE_SUSPENDED

class Task(val type: TaskType, private val subject: TaskSubject) : Continuation<Unit> {

    internal var next: TaskContinuation? = null

    private var cancellation: TaskContinuation? = null

    override val context: CoroutineContext = EmptyCoroutineContext

    fun run(): Boolean {
        return next?.let {
            if(it.resume()) {
                subject.tasks[type]?.remove(this)
                it.continuation.resume(Unit)
                true
            } else false
        } ?: run {
            cancellation?.continuation?.resume(Unit)
            subject.tasks[type]?.remove(this)
            false
        }
    }

    fun cancel() {
        subject.tasks.getOrPut(type) { mutableSetOf() }.add(this)
        next = null
    }

    fun cancelTasks(type: TaskType) {
        subject.tasks[type]?.forEach { it.cancel() }
        cancel()
    }

    fun onCancelled(action: suspend Task.() -> Unit) {
        cancellation = TaskContinuation(TaskEmptyCondition, action.createCoroutineUnintercepted(this, this))
    }

    fun postProcess() {
        next?.postProcess()
    }

    override fun resumeWith(result: Result<Unit>) {
        result.exceptionOrNull()?.let {
            Logger.error(it) { "An error occurred while executing task." }
            cancel()
        }
    }

    suspend fun wait(ticks: Int) {
        suspend(TaskTickCondition(ticks))
    }

    suspend fun waitUntil(predicate: () -> Boolean) {
        suspend(TaskPredicateCondition(predicate))
    }

    private suspend fun suspend(condition: TaskCondition) {
        subject.tasks.getOrPut(type) { mutableSetOf() }.add(this)
        return suspendCoroutineUninterceptedOrReturn { cont ->
            next = TaskContinuation(condition, cont)
            COROUTINE_SUSPENDED
        }
    }
}