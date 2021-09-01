package dev.avernic.server.engine.game.collision

import dev.avernic.server.engine.game.World
import dev.avernic.server.engine.game.entity.GameObject
import dev.avernic.server.engine.game.map.Chunk
import dev.avernic.server.engine.game.map.Tile

internal fun World.addObjectCollision(obj: GameObject) {
    obj.registerCollision(this::addWallCollision, this::addRegularCollision, this::addDecorationCollision)
}

private fun World.addCollision(plane: Int, x: Int, y: Int, mask: Int) {
    val chunk = getChunk(x, y, plane)
    chunk?.addCollision(x % Chunk.SIZE, y % Chunk.SIZE, mask)
}

private fun World.addWallCollision(tile: Tile, type: Int, orientation: Int, impenetrable: Boolean) {
    registerWallCollision(tile, type, orientation, impenetrable, this::addCollision)
}

private fun World.addDecorationCollision(tile: Tile) {
    addCollision(tile.plane, tile.x, tile.y, Collision.MASK_DECORATION)
}

private fun World.addRegularCollision(
    tile: Tile,
    sizeX: Int,
    sizeY: Int,
    impenetrable: Boolean
) {
    registerRegularCollision(tile, sizeX, sizeY, impenetrable, this::addCollision)
}

private fun GameObject.registerCollision(
    wall: (Tile, Int, Int, Boolean) -> Unit,
    regular: (Tile, Int, Int, Boolean) -> Unit,
    decoration: (Tile) -> Unit
) {
    when(type) {
        in 0..3 -> {
            if(clipType != 0) {
                wall(tile, type, orientation, impenetrable)
            }
        }
        in 9..21 -> {
            if(clipType != 0) {
                var sizeX = width
                var sizeY = length
                if(orientation == 1 || orientation == 3) {
                    sizeX = length
                    sizeY = width
                }
                regular(tile, sizeX, sizeY, impenetrable)
            }
        }
        22 -> if(clipType == 1) decoration(tile)
    }
}

private fun registerWallCollision(
    tile: Tile,
    type: Int,
    orientation: Int,
    impenetrable: Boolean,
    op: (Int, Int, Int, Int) -> Unit?
) {
    when (type) {
        0 -> {
            when (orientation) {
                0 -> {
                    op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_W)
                    op(tile.plane, tile.x - 1, tile.y, Collision.MASK_WALL_E)
                }
                1 -> {
                    op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_N)
                    op(tile.plane, tile.x, tile.y + 1, Collision.MASK_WALL_S)
                }
                2 -> {
                    op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_E)
                    op(tile.plane, tile.x + 1, tile.y, Collision.MASK_WALL_W)
                }
                3 -> {
                    op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_S)
                    op(tile.plane, tile.x, tile.y - 1, Collision.MASK_WALL_N)
                }
            }
        }
        1, 3 -> {
            when (orientation) {
                0 -> {
                    op(tile.plane, tile.x, tile.y, Collision.MASK_PILLAR_NW)
                    op(tile.plane, tile.x - 1, tile.y + 1, Collision.MASK_PILLAR_SE)
                }
                1 -> {
                    op(tile.plane, tile.x, tile.y, Collision.MASK_PILLAR_NE)
                    op(tile.plane, tile.x + 1, tile.y + 1, Collision.MASK_PILLAR_SW)
                }
                2 -> {
                    op(tile.plane, tile.x, tile.y, Collision.MASK_PILLAR_SE)
                    op(tile.plane, tile.x + 1, tile.y - 1, Collision.MASK_PILLAR_NW)
                }
                3 -> {
                    op(tile.plane, tile.x, tile.y, Collision.MASK_PILLAR_SW)
                    op(tile.plane, tile.x - 1, tile.y - 1, Collision.MASK_PILLAR_NE)
                }
            }
        }
        2 -> {
            when (orientation) {
                0 -> {
                    op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_W or Collision.MASK_WALL_N)
                    op(tile.plane, tile.x - 1, tile.y, Collision.MASK_WALL_E)
                    op(tile.plane, tile.x, tile.y + 1, Collision.MASK_WALL_S)
                }
                1 -> {
                    op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_N or Collision.MASK_WALL_E)
                    op(tile.plane, tile.x, tile.y + 1, Collision.MASK_WALL_S)
                    op(tile.plane, tile.x + 1, tile.y, Collision.MASK_WALL_W)
                }
                2 -> {
                    op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_E or Collision.MASK_WALL_S)
                    op(tile.plane, tile.x + 1, tile.y, Collision.MASK_WALL_W)
                    op(tile.plane, tile.x, tile.y - 1, Collision.MASK_WALL_N)
                }
                3 -> {
                    op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_S or Collision.MASK_WALL_W)
                    op(tile.plane, tile.x, tile.y - 1, Collision.MASK_WALL_N)
                    op(tile.plane, tile.x - 1, tile.y, Collision.MASK_WALL_E)
                }
            }
        }
    }
    if (impenetrable) {
        when (type) {
            0 -> {
                when (orientation) {
                    0 -> {
                        op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_HIGH_W)
                        op(tile.plane, tile.x - 1, tile.y, Collision.MASK_WALL_HIGH_E)
                    }
                    1 -> {
                        op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_HIGH_N)
                        op(tile.plane, tile.x, tile.y + 1, Collision.MASK_WALL_HIGH_S)
                    }
                    2 -> {
                        op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_HIGH_E)
                        op(tile.plane, tile.x + 1, tile.y, Collision.MASK_WALL_HIGH_W)
                    }
                    3 -> {
                        op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_HIGH_S)
                        op(tile.plane, tile.x, tile.y - 1, Collision.MASK_WALL_HIGH_N)
                    }
                }

            }
            1, 3 -> {
                when (orientation) {
                    0 -> {
                        op(tile.plane, tile.x, tile.y, Collision.MASK_PILLAR_HIGH_NW)
                        op(tile.plane, tile.x - 1, tile.y + 1, Collision.MASK_PILLAR_HIGH_SE)
                    }
                    1 -> {
                        op(tile.plane, tile.x, tile.y, Collision.MASK_PILLAR_HIGH_NE)
                        op(tile.plane, tile.x + 1, tile.y + 1, Collision.MASK_PILLAR_HIGH_SW)
                    }
                    2 -> {
                        op(tile.plane, tile.x, tile.y, Collision.MASK_PILLAR_HIGH_SE)
                        op(tile.plane, tile.x + 1, tile.y - 1, Collision.MASK_PILLAR_HIGH_NW)
                    }
                    3 -> {
                        op(tile.plane, tile.x, tile.y, Collision.MASK_PILLAR_HIGH_SW)
                        op(tile.plane, tile.x - 1, tile.y - 1, Collision.MASK_PILLAR_HIGH_NE)
                    }
                }
            }
            2 -> {
                when (orientation) {
                    0 -> {
                        op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_HIGH_W or Collision.MASK_WALL_HIGH_N)
                        op(tile.plane, tile.x - 1, tile.y, Collision.MASK_WALL_HIGH_E)
                        op(tile.plane, tile.x, tile.y + 1, Collision.MASK_WALL_HIGH_S)
                    }
                    1 -> {
                        op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_HIGH_N or Collision.MASK_WALL_HIGH_E)
                        op(tile.plane, tile.x, tile.y + 1, Collision.MASK_WALL_HIGH_S)
                        op(tile.plane, tile.x + 1, tile.y, Collision.MASK_WALL_HIGH_W)
                    }
                    2 -> {
                        op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_HIGH_E or Collision.MASK_WALL_HIGH_S)
                        op(tile.plane, tile.x + 1, tile.y, Collision.MASK_WALL_HIGH_W)
                        op(tile.plane, tile.x, tile.y - 1, Collision.MASK_WALL_HIGH_N)
                    }
                    3 -> {
                        op(tile.plane, tile.x, tile.y, Collision.MASK_WALL_HIGH_S or Collision.MASK_WALL_HIGH_W)
                        op(tile.plane, tile.x, tile.y - 1, Collision.MASK_WALL_HIGH_N)
                        op(tile.plane, tile.x - 1, tile.y, Collision.MASK_WALL_HIGH_E)
                    }
                }
            }
        }
    }
}

private fun registerRegularCollision(
    tile: Tile,
    sizeX: Int,
    sizeY: Int,
    impenetrable: Boolean,
    op: (Int, Int, Int, Int) -> Unit
) {
    var mask = Collision.MASK_LOC
    if(impenetrable) mask = mask or Collision.MASK_LOC_HIGH
    for(x in tile.x until (tile.x + sizeX)) {
        for(y in tile.y until (tile.y + sizeY)) {
            op(tile.plane, x, y, mask)
        }
    }
}