package dev.avernic.server.engine.game.entity.pathfinder

import dev.avernic.server.engine.game.entity.pathfinder.dest.Destination
import dev.avernic.server.engine.game.map.Tile

abstract class Pathfinder {

    abstract fun calculatePath(start: Tile, dest: Destination): MutableList<Tile>

    companion object {
        /**
         * The maximum number of tiles a pathfinder's result can be.
         */
        const val MAX_DISTANCE = 20
    }
}