package dev.avernic.server.engine.game.collision

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