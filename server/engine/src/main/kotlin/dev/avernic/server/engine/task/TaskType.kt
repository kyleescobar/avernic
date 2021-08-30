package dev.avernic.server.engine.task

sealed class TaskType {
    object WEAK : TaskType()
    object NORMAL : TaskType()
    object STRONG : TaskType()
}