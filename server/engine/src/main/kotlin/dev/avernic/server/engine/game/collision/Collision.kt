package dev.avernic.server.engine.game.collision

import dev.avernic.server.engine.game.Direction
import dev.avernic.server.engine.game.World
import dev.avernic.server.engine.game.map.Tile

/**
 * Gets the collision mask at a given tile in the world.
 *
 * @receiver World
 * @param tile Tile
 * @return Int
 */
fun World.getCollision(tile: Tile): Int {
    val chunk = this.getChunk(tile)
    return chunk?.getCollision(tile) ?: Collision.MASK_TERRAIN_BLOCK
}


/**
 * Gets the collision mask at a given tile [x,y,plane] coordinates in the world.
 *
 * @receiver World
 * @param x Int
 * @param y Int
 * @param plane Int
 * @return Int
 */
fun World.getCollision(x: Int, y: Int, plane: Int): Int {
    return getCollision(Tile(x, y, plane))
}

fun World.isNotBlocked(tile: Tile, direction: Direction, size: Int = 1): Boolean {
    return when(direction) {
        Direction.WEST -> (0 until size).none { getCollision(tile.translate(-1, it)) and Collision.BLOCK_E != 0 }
        Direction.EAST -> (0 until size).none { getCollision(tile.translate(size, it)) and Collision.BLOCK_W != 0 }
        Direction.SOUTH -> (0 until size).none { getCollision(tile.translate(it, -1)) and Collision.BLOCK_N != 0 }
        Direction.NORTH -> (0 until size).none { getCollision(tile.translate(it, size)) and Collision.BLOCK_S != 0 }
        Direction.SOUTH_WEST -> {
            if(getCollision(tile.translate(size - 1, -1)) and Collision.BLOCK_N != 0) return false
            if(getCollision(tile.translate(-1, size - 1)) and Collision.BLOCK_E != 0) return false
            for(i in 0 until size) {
                if(getCollision(tile.translate(i - 1, -1)) and Collision.BLOCK_NE != 0) return false
                if(getCollision(tile.translate(-1, i - 1)) and Collision.BLOCK_NE != 0) return false
            }
            true
        }
        Direction.SOUTH_EAST -> {
            if(getCollision(tile.translate(0, -1)) and Collision.BLOCK_N != 0) return false
            if(getCollision(tile.translate(size, size - 1)) and Collision.BLOCK_W != 0) return false
            for(i in 0 until size) {
                if(getCollision(tile.translate(size - i, -1)) and Collision.BLOCK_NW != 0) return false
                if(getCollision(tile.translate(size, i - 1)) and Collision.BLOCK_NW != 0) return false
            }
            true
        }
        Direction.NORTH_WEST -> {
            if(getCollision(tile.translate(size - 1, size)) and Collision.BLOCK_S != 0) return false
            if(getCollision(tile.translate(-1, 0)) and Collision.BLOCK_E != 0) return false
            for(i in 0 until size) {
                if(getCollision(tile.translate(-1, size - i)) and Collision.BLOCK_SE != 0) return false
                if(getCollision(tile.translate(i - 1, size)) and Collision.BLOCK_SE != 0) return false
            }
            true
        }
        Direction.NORTH_EAST -> {
            if(getCollision(tile.translate(0, size)) and Collision.BLOCK_S != 0) return false
            if(getCollision(tile.translate(size, 0)) and Collision.BLOCK_E != 0) return false
            for(i in 0 until size) {
                if(getCollision(tile.translate(size, size - i)) and Collision.BLOCK_SW != 0) return false
                if(getCollision(tile.translate(size - i, size - i)) and Collision.BLOCK_SW != 0) return false
            }
            true
        }
        else -> true
    }
}

object Collision {
    const val MASK_PILLAR_NW: Int = 0x1
    const val MASK_WALL_N: Int = 0x2
    const val MASK_PILLAR_NE: Int = 0x4
    const val MASK_WALL_E: Int = 0x8
    const val MASK_PILLAR_SE: Int = 0x10
    const val MASK_WALL_S: Int = 0x20
    const val MASK_PILLAR_SW: Int = 0x40
    const val MASK_WALL_W: Int = 0x80
    const val MASK_LOC: Int = 0x100
    const val MASK_PILLAR_HIGH_NW: Int = 0x200
    const val MASK_WALL_HIGH_N: Int = 0x400
    const val MASK_PILLAR_HIGH_NE: Int = 0x800
    const val MASK_WALL_HIGH_E: Int = 0x1000
    const val MASK_PILLAR_HIGH_SE: Int = 0x2000
    const val MASK_WALL_HIGH_S: Int = 0x4000
    const val MASK_PILLAR_HIGH_SW: Int = 0x8000
    const val MASK_WALL_HIGH_W: Int = 0x10000
    const val MASK_LOC_HIGH: Int = 0x20000
    const val MASK_DECORATION: Int = 0x40000
    const val MASK_TERRAIN_BLOCK: Int = 0x200000
    const val BLOCK_TILE: Int = MASK_LOC or MASK_TERRAIN_BLOCK or MASK_DECORATION
    const val BLOCK_NW: Int = MASK_WALL_N or MASK_PILLAR_NW or MASK_WALL_W or BLOCK_TILE
    const val BLOCK_N: Int = MASK_WALL_N or BLOCK_TILE
    const val BLOCK_NE: Int = MASK_WALL_N or MASK_PILLAR_NE or MASK_WALL_E or BLOCK_TILE
    const val BLOCK_E: Int = MASK_WALL_E or BLOCK_TILE
    const val BLOCK_SE: Int = MASK_WALL_S or MASK_PILLAR_SE or MASK_WALL_E or BLOCK_TILE
    const val BLOCK_S: Int = MASK_WALL_S or BLOCK_TILE
    const val BLOCK_SW: Int = MASK_WALL_S or MASK_PILLAR_SW or MASK_WALL_W or BLOCK_TILE
    const val BLOCK_W: Int = MASK_WALL_W or BLOCK_TILE
    const val BLOCK_HIGH_N: Int = MASK_WALL_HIGH_N or MASK_LOC_HIGH
    const val BLOCK_HIGH_E: Int = MASK_WALL_HIGH_E or MASK_LOC_HIGH
    const val BLOCK_HIGH_S: Int = MASK_WALL_HIGH_S or MASK_LOC_HIGH
    const val BLOCK_HIGH_W: Int = MASK_WALL_HIGH_W or MASK_LOC_HIGH
}