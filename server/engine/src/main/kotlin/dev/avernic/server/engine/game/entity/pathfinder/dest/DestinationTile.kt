package dev.avernic.server.engine.game.entity.pathfinder.dest

class DestinationTile(x: Int, y: Int, plane: Int) : Destination(x, y, plane) {
    override fun reached(x: Int, y: Int, size: Int): Boolean {
        return this.x == x && this.y == y
    }
}