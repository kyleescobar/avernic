package dev.avernic.server.engine.game.entity.pathfinder

import dev.avernic.server.engine.game.Direction
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.entity.pathfinder.dest.Destination
import dev.avernic.server.engine.game.map.Tile
import kotlin.math.abs

class BfsPathfinder(private val player: Player) : Pathfinder() {

    override fun calculatePath(start: Tile, dest: Destination): MutableList<Tile> {
        val pathBaseX = start.x - (SEARCH_SIZE / 2)
        val pathBaseY = start.y - (SEARCH_SIZE / 2)
        var endX = dest.x
        var endY = dest.y
        if(dest.reached(start.x, start.y, player.size)) {
            return emptyList<Tile>().toMutableList()
        }

        val dirs = Array(SEARCH_SIZE) { IntArray(SEARCH_SIZE) }
        val dists = Array(SEARCH_SIZE) { IntArray(SEARCH_SIZE) { Int.MAX_VALUE } }

        fun solve(start: Tile, dest: Destination, size: Int): Boolean {
            val bufX = IntArray(MAX_QUEUE_LENGTH)
            val bufY = IntArray(MAX_QUEUE_LENGTH)
            var curIndex = 0
            var nextIndex = 0

            bufX[nextIndex] = start.x
            bufY[nextIndex] = start.y
            nextIndex++

            var curBaseX: Int
            var curBaseY: Int
            while(curIndex != nextIndex) {
                val curX = bufX[curIndex]
                val curY = bufY[curIndex]

                curIndex = (curIndex + 1) and 0xFFF
                curBaseX = curX - pathBaseX
                curBaseY = curY - pathBaseY

                if(dest.reached(curX, curY, size)) {
                    endX = curX
                    endY = curY
                    return true
                }

                val nextDist = dists[curBaseX][curBaseY] + 1
                if(curBaseX > 0 && dirs[curBaseX - 1][curBaseY] == 0) {
                    bufX[nextIndex] = curX - 1
                    bufY[nextIndex] = curY
                    nextIndex = (nextIndex + 1) and 0xFFF
                    dirs[curBaseX - 1][curBaseY] = Direction.EAST.mask
                    dists[curBaseX - 1][curBaseY] = nextDist
                }
                if(curBaseX < SEARCH_SIZE - 1 && dirs[curBaseX + 1][curBaseY] == 0) {
                    bufX[nextIndex] = curX + 1
                    bufY[nextIndex] = curY
                    nextIndex = (nextIndex + 1) and 0xFFF
                    dirs[curBaseX + 1][curBaseY] = Direction.WEST.mask
                    dists[curBaseX + 1][curBaseY] = nextDist
                }
                if(curBaseY > 0 && dirs[curBaseX][curBaseY - 1] == 0) {
                    bufX[nextIndex] = curX
                    bufY[nextIndex] = curY - 1
                    nextIndex = (nextIndex + 1) and 0xFFF
                    dirs[curBaseX][curBaseY - 1] = Direction.NORTH.mask
                    dists[curBaseX][curBaseY - 1] = nextDist
                }
                if(curBaseY < SEARCH_SIZE - 1 && dirs[curBaseX][curBaseY + 1] == 0) {
                    bufX[nextIndex] = curX
                    bufY[nextIndex] = curY + 1
                    nextIndex = (nextIndex + 1) and 0xFFF
                    dirs[curBaseX][curBaseY + 1] = Direction.SOUTH.mask
                    dists[curBaseX][curBaseY + 1] = nextDist
                }
                if(curBaseX > 0 && curBaseY > 0 && dirs[curBaseX - 1][curBaseY - 1] == 0) {
                    bufX[nextIndex] = curX - 1
                    bufY[nextIndex] = curY - 1
                    nextIndex = (nextIndex + 1) and 0xFFF
                    dirs[curBaseX - 1][curBaseY - 1] = Direction.NORTH.mask or Direction.EAST.mask
                    dists[curBaseX - 1][curBaseY - 1] = nextDist
                }
                if(curBaseX < SEARCH_SIZE - 1 && curBaseY > 0 && dirs[curBaseX + 1][curBaseY - 1] == 0) {
                    bufX[nextIndex] = curX + 1
                    bufY[nextIndex] = curY - 1
                    nextIndex = (nextIndex + 1) and 0xFFF
                    dirs[curBaseX + 1][curBaseY - 1] = Direction.NORTH.mask or Direction.WEST.mask
                    dists[curBaseX + 1][curBaseY - 1] = nextDist
                }
                if(curBaseX > 0 && curBaseY < SEARCH_SIZE - 1 && dirs[curBaseX - 1][curBaseY + 1] == 0) {
                    bufX[nextIndex] = curX - 1
                    bufY[nextIndex] = curY + 1
                    nextIndex = (nextIndex + 1) and 0xFFF
                    dirs[curBaseX - 1][curBaseY + 1] = Direction.SOUTH.mask or Direction.EAST.mask
                    dists[curBaseX - 1][curBaseY + 1] = nextDist
                }
                if(curBaseX < SEARCH_SIZE - 1 && curBaseY < SEARCH_SIZE - 1 && dirs[curBaseX + 1][curBaseY + 1] == 0) {
                    bufX[nextIndex] = curX + 1
                    bufY[nextIndex] = curY + 1
                    nextIndex = (nextIndex + 1) and 0xFFF
                    dirs[curBaseX + 1][curBaseY + 1] = Direction.SOUTH.mask or Direction.WEST.mask
                    dists[curBaseX + 1][curBaseY + 1] = nextDist
                }
            }

            return false
        }

        fun solveAlt(dest: Destination) {
            var lowestCost = Int.MAX_VALUE
            var lowestDist = Int.MAX_VALUE

            for(x in dest.x - MAX_DISTANCE..dest.x + MAX_DISTANCE) {
                for(y in dest.y - MAX_DISTANCE..dest.y + MAX_DISTANCE) {
                    val localX = x - pathBaseX
                    val localY = y - pathBaseY

                    if(localX >= SEARCH_SIZE
                        || localY >= SEARCH_SIZE
                        || localX < 0
                        || localY < 0
                        || dists[localX][localY] >= MAX_PATH) continue

                    val dx = abs(dest.x - x)
                    val dy = abs(dest.y - y)
                    val cost = dx * dx + dy * dy
                    if(cost < lowestCost || (cost == lowestCost && dists[localX][localY] < lowestDist)) {
                        lowestCost = cost
                        lowestDist = dists[localX][localY]
                        endX = x
                        endY = y
                    }
                }
            }
        }

        val foundSolution = solve(start, dest, player.size)
        if(!foundSolution) {
            solveAlt(dest)
        }

        if(start.x == endX && start.y == endY) {
            return emptyList<Tile>().toMutableList()
        }

        var x = endX
        var y = endY
        var dir: Int
        val path = mutableListOf<Tile>()

        while(x != start.x || y != start.y) {
            dir = dirs[x - pathBaseX][y - pathBaseY]
            path.add(Tile(x, y, dest.plane))
            when {
                dir and Direction.EAST.mask != 0 -> x++
                dir and Direction.WEST.mask != 0 -> x--
            }
            when {
                dir and Direction.NORTH.mask != 0 -> y++
                dir and Direction.SOUTH.mask != 0 -> y--
            }
        }

        return path.asReversed()
    }

    companion object {
        private const val MAX_QUEUE_LENGTH = 4096
        private const val SEARCH_SIZE = 104
        private const val MAX_DISTANCE = 10
        private const val MAX_PATH = 99
    }
}