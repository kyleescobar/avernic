package dev.avernic.server.engine.game.entity.pathfinder

import dev.avernic.server.engine.game.Direction
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.entity.pathfinder.destination.Destination
import dev.avernic.server.engine.game.map.Tile
import java.util.*

class PlayerPathfinder(private val player: Player) : Pathfinder {

    private val queue = LinkedList<Node>()
    private val visited = LinkedList<Node>()

    override fun calculatePath(start: Tile, destination: Destination): MutableList<Tile> {
        val dest = Tile(destination.x, destination.y, start.plane)

        queue.clear()
        visited.clear()

        var searchLimit = 4096

        val directions = arrayOf(
            Direction.WEST,
            Direction.EAST,
            Direction.NORTH,
            Direction.SOUTH,
            Direction.SOUTH_WEST,
            Direction.SOUTH_EAST,
            Direction.NORTH_WEST,
            Direction.NORTH_EAST
        )

        queue.add(Node(start))
        while(queue.isNotEmpty()) {
            if(searchLimit-- == 0) break

            val node = queue.removeFirst()
            if(node.tile.sameAs(destination.x, destination.y)) {
                return buildSolution(node)
            }

            directions.sortBy { dir ->
                node.tile.translate(dir).getDelta(dest) + node.tile.translate(dir).getDelta(node.tile)
            }

            directions.forEach { dir ->
                val tile = node.tile.translate(dir)
                val neighbor = Node(tile, node)
                if(!visited.contains(neighbor) && start.isWithinRadius(tile, MAX_DISTANCE)) {
                    neighbor.cost = node.cost + 1
                    queue.add(neighbor)
                    visited.addLast(neighbor)
                }
            }
        }

        return mutableListOf()
    }

    private fun buildSolution(node: Node): MutableList<Tile> {
        val path = ArrayDeque<Tile>()
        var end: Node? = node
        while(end?.parent != null) {
            path.addFirst(end.tile)
            end = end.parent
        }

        return path.toMutableList()
    }

    private data class Node(val tile: Tile, var parent: Node? = null) {
        var cost = 0

        override fun equals(other: Any?): Boolean {
            return (other as? Node)?.tile?.sameAs(tile) ?: false
        }

        override fun hashCode(): Int {
            return tile.hash
        }
    }

    companion object {
        /**
         * The maximum distance to find a path to.
         */
        private const val MAX_DISTANCE = 12
    }
}