package dev.avernic.server.engine.game

enum class Direction(val mask: Int, val stepX: Int, val stepY: Int) {
    NORTH(0x1, 0, 1),
    EAST(0x2, 1, 0),
    SOUTH(0x4, 0, -1),
    WEST(0x8, -1, 0),
    NORTH_EAST(NORTH.mask or EAST.mask, EAST.stepX, NORTH.stepY),
    SOUTH_EAST(SOUTH.mask or EAST.mask, EAST.stepX, SOUTH.stepY),
    NORTH_WEST(NORTH.mask or WEST.mask, WEST.stepX, NORTH.stepY),
    SOUTH_WEST(SOUTH.mask or WEST.mask, WEST.stepX, SOUTH.stepY)
}