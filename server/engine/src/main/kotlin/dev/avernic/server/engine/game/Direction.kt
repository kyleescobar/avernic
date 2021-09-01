package dev.avernic.server.engine.game

import dev.avernic.server.engine.game.map.Tile

enum class Direction(val mask: Int, val stepX: Int, val stepY: Int) {
    NONE(0x0, 0, 0),
    NORTH(0x1, 0, 1),
    EAST(0x2, 1, 0),
    SOUTH(0x4, 0, -1),
    WEST(0x8, -1, 0),
    NORTH_EAST(NORTH.mask or EAST.mask, EAST.stepX, NORTH.stepY),
    SOUTH_EAST(SOUTH.mask or EAST.mask, EAST.stepX, SOUTH.stepY),
    NORTH_WEST(NORTH.mask or WEST.mask, WEST.stepX, NORTH.stepY),
    SOUTH_WEST(SOUTH.mask or WEST.mask, WEST.stepX, SOUTH.stepY);

    companion object {

        fun between(current: Tile, other: Tile): Direction {
            val dx = other.x - current.x
            when (other.y - current.y) {
                1 -> when (dx) {
                    1 -> return NORTH_EAST
                    0 -> return NORTH
                    -1 -> return NORTH_WEST
                }
                -1 -> when (dx) {
                    1 -> return SOUTH_EAST
                    0 -> return SOUTH
                    -1 -> return SOUTH_WEST
                }
                0 -> when (dx) {
                    1 -> return EAST
                    0 -> return NONE
                    -1 -> return WEST
                }
            }
            throw IllegalArgumentException("Unable to get a direction between the provided tiles.")
        }
    }
}