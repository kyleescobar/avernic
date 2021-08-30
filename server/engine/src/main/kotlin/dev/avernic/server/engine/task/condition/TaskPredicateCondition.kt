package dev.avernic.server.engine.task.condition

class TaskPredicateCondition(private val predicate: () -> Boolean) : TaskCondition {

    override fun resume(): Boolean {
        return predicate()
    }

}