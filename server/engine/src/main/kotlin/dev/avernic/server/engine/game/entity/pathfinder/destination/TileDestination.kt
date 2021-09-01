package dev.avernic.server.engine.game.entity.pathfinder.destination

class TileDestination(x: Int, y: Int) : Destination(x, y) {

    override fun hasReached(currentX: Int, currentY: Int, size: Int): Boolean {
        return (x == currentX) && (y == currentY)
    }

}