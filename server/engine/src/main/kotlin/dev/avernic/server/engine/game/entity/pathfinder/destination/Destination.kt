package dev.avernic.server.engine.game.entity.pathfinder.destination

abstract class Destination(val x: Int, val y: Int) {

    abstract fun hasReached(currentX: Int, currentY: Int, size: Int = 1): Boolean

}