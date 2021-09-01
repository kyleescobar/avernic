package dev.avernic.server.engine.game.entity.pathfinder

import dev.avernic.server.engine.game.Direction
import dev.avernic.server.engine.game.collision.isNotBlocked
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.entity.pathfinder.destination.Destination
import dev.avernic.server.engine.game.map.Tile
import java.util.*

class PlayerPathfinder(private val player: Player) : Pathfinder {

    private val queue = LinkedList<Node>()
    private val visited = LinkedList<Node>()

    private lateinit var start: Tile
    private lateinit var dest: Tile

    private var current: Node? = null
    private var cancel: Boolean = false
    private var successful: Boolean = false

    override fun calculatePath(start: Tile, destination: Destination): MutableList<Tile> {
        this.start = start
        dest = Tile(destination.x, destination.y, start.plane)

        queue.clear()
        visited.clear()

        var searchLimit = 2048

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

        if(start.getDistance(dest) == 1 && !player.world.isNotBlocked(player.tile, Direction.between(player.tile, dest), player.size)) {
            return mutableListOf()
        }

        queue.add(Node(start))
        while(queue.isNotEmpty()) {
            if(cancel) {
                cancel = false
                break
            }

            if(searchLimit-- == 0) break

            val node = queue.removeFirst()
            if(destination.hasReached(node.tile.x, node.tile.y, player.size)) {
                return buildSolution(node)
            }

            directions.sortBy { dir ->
                node.tile.translate(dir).getDelta(dest) + node.tile.translate(dir).getDelta(node.tile)
            }

            directions.forEach { dir ->
                val tile = node.tile.translate(dir)
                val neighbor = Node(tile, node)
                if(
                    !visited.contains(neighbor)
                    && start.isWithinRadius(tile, MAX_DISTANCE)
                    && Direction.between(node.tile, tile) != Direction.NONE
                    && (player.noclip || player.world.isNotBlocked(node.tile, Direction.between(node.tile, tile), player.size))
                ) {
                    neighbor.cost = node.cost + 1
                    queue.add(neighbor)
                    visited.addLast(neighbor)
                }
            }

            current = node
        }

        return buildSolution(current)
    }

    private fun buildSolution(node: Node?): MutableList<Tile> {
        val path = ArrayDeque<Tile>()
        var end: Node? = node

        if(end != null && visited.isNotEmpty()) {
            val heuristic = visited.minByOrNull { it.tile.getDistance(dest) }!!
            val sorted = visited.filter { it.tile.getDistance(dest) <= heuristic.tile.getDistance(dest) }
            if(sorted.isNotEmpty()) {
                end = sorted.minByOrNull { it.tile.getDelta(start) }
            }
        }

        while(end?.parent != null) {
            path.addFirst(end.tile)
            end = end.parent
        }

        return  if(path.size > MAX_PATH) path.toMutableList().dropLast(path.size - MAX_PATH).toMutableList() else path.toMutableList()
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
         * The maximum distance the destination tile can be away from the
         * starting tile.
         */
        private const val MAX_DISTANCE = 30

        /**
         * The maximum number of steps a resulting path can be.
         */
        private const val MAX_PATH = 12
    }
}