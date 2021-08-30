package dev.avernic.server.engine.task.condition

class TaskTickCondition(var ticks: Int) : TaskCondition {

    var ticked: Boolean = false

    override fun resume(): Boolean {
        return if(!ticked) {
            ticked = true
            ticks-- <= 0
        } else false
    }

    override fun postProcess() {
        ticked = false
    }
}