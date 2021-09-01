package dev.avernic.server.engine.api

import dev.avernic.server.engine.game.Direction
import dev.avernic.server.engine.game.World
import dev.avernic.server.engine.game.collision.Collision
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