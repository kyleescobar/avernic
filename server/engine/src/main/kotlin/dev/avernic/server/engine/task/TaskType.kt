package dev.avernic.server.engine.task

interface TaskType

object StrongTask : TaskType
object NormalTask : TaskType
object WeakTask : TaskType