package dev.avernic.server.engine.task.condition

interface TaskCondition {
    fun resume(): Boolean
    fun postProcess() {}
}