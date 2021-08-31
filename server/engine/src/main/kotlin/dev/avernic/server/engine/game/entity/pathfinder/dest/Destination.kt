package dev.avernic.server.engine.game.entity.pathfinder.dest

abstract class Destination(
    val x: Int,
    val y: Int,
    val plane: Int
) {
    abstract fun reached(x: Int, y: Int, size: Int = 1) : Boolean
}