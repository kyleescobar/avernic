package dev.avernic.server.engine.game.entity.pathfinder

import dev.avernic.server.engine.game.map.Tile

abstract class Pathfinder {

    abstract fun calculatePath(start: Tile, end: Tile): List<Tile>

    companion object {
        /**
         * The maximum number of tiles a pathfinder's result can be.
         */
        const val MAX_DISTANCE = 20
    }
}