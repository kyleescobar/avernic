package dev.avernic.server.engine.game.entity.pathfinder

import dev.avernic.server.engine.game.entity.pathfinder.destination.Destination
import dev.avernic.server.engine.game.map.Tile

class SimplePathfinder : Pathfinder {

    override fun calculatePath(start: Tile, destination: Destination): MutableList<Tile> {
        return mutableListOf()
    }

}