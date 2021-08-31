package dev.avernic.server.engine.game.entity.pathfinder

import dev.avernic.server.engine.game.Direction
import dev.avernic.server.engine.game.map.Tile
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
import java.util.ArrayDeque

class TmpPathfinder() : Pathfinder() {

    private val queue = ArrayDeque<Node>()
    private val visited = ObjectOpenHashSet<Node>()
    private var last: Node? = null

    private var searchLimit = 256 * 10
    private var completed = false

    override fun calculatePath(start: Tile, end: Tile): List<Tile> {
        queue.add(Node(start))

        while(queue.isNotEmpty()) {
            if(searchLimit-- == 0) {
                break
            }

            val current = queue.poll()

            val isGoal = current.tile.sameAs(end)
            if(isGoal) {
                last = current
                completed = true
                break
            }

            Direction.values().forEach { direction ->
                val tile = current.tile.translate(direction)
                val node = Node(tile, current)
                if(!visited.contains(node) && start.isWithinRadius(tile, MAX_DISTANCE)) {
                    node.cost = current.cost + 1
                    queue.add(node)
                    visited.add(node)
                }
            }
        }

        if(last == null && visited.isNotEmpty()) {
            val min = visited.minByOrNull { it.tile.getDistance(end) }!!
            val valid = visited.filter { it.tile.getDistance(end) <= min.tile.getDistance(end) }
            if(valid.isNotEmpty()) {
                last = valid.minByOrNull { it.tile.getDelta(start) }
            }
        }

        val path = ArrayDeque<Tile>()

        while(last?.parent != null) {
            path.addFirst(last!!.tile)
            last = last!!.parent
        }

        return path.toList()
    }

    private data class Node(val tile: Tile, var parent: Node? = null) {
        var cost: Int = 0
    }
}