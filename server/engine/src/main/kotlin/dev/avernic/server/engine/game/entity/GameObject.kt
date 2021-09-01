package dev.avernic.server.engine.game.entity

import dev.avernic.server.cache.GameCache
import dev.avernic.server.common.inject
import dev.avernic.server.engine.game.map.Chunk
import dev.avernic.server.engine.game.map.Tile

class GameObject(
    val id: Int,
    val type: Int,
    override val tile: Tile,
    override var orientation: Int
) : Entity {
    private val cache: GameCache by inject()

    /**
     *  The cache object config definition.
     */
    private val definition = cache.configArchive.objConfigs[id]
        ?: throw IllegalArgumentException("Unknown object cache definition for object id: $id.")

    val slot: Int get() = MAP_SLOTS[type]

    val hash: Int get() = ((tile.x % Chunk.SIZE) shl 5) or ((tile.y % Chunk.SIZE) shl 2) or slot

    val name: String = definition.name
    val impenetrable: Boolean get() = definition.impenetrable
    val clipType: Int get() = definition.clipType
    val width: Int get() = definition.width.toInt()
    val length: Int get() = definition.length.toInt()

    val blockFlags: Int get() = if(orientation != 0) {
        (definition.accessBlock.toInt() shl orientation and 0xF) + (definition.accessBlock.toInt() shr 4 - orientation)
    } else {
        definition.accessBlock.toInt()
    }

    companion object {
        internal const val UNIQUE_SLOTS: Int = 4
        internal val MAP_SLOTS: IntArray = intArrayOf(
            0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3
        )
    }
}