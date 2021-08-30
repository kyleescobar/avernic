package dev.avernic.server.engine.task.condition

object TaskEmptyCondition : TaskCondition {

    override fun resume(): Boolean {
        return true
    }

}