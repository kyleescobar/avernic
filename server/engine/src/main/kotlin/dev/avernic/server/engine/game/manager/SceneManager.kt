package dev.avernic.server.engine.game.manager

import dev.avernic.server.common.inject
import dev.avernic.server.config.XteaConfig
import dev.avernic.server.engine.game.World
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.map.Chunk
import dev.avernic.server.engine.net.packet.server.RebuildRegionNormal
import kotlin.math.abs

class SceneManager(private val player: Player) {

    private val world: World by inject()

    /**
     * The current chunk the player is in.
     */
    lateinit var chunk: Chunk private set

    val baseX: Int get() = chunk.x - DISTANCE
    val baseY: Int get() = chunk.y - DISTANCE

    internal fun initialize() {
        /*
         * Set the player's current chunk.
         */
        chunk = world.getChunk(player.tile.chunkX, player.tile.chunkY, player.tile.plane)

        /*
         * Tell the client to rebuild the world regions with GPI data.
         */
        player.client.write(RebuildRegionNormal(player, gpi = true))
    }

    fun shouldRebuild(currentChunk: Chunk): Boolean {
        return abs(chunk.x - currentChunk.x) > REBUILD_DISTANCE || abs(chunk.y - currentChunk.y) > REBUILD_DISTANCE
    }

    fun checkReload(currentChunk: Chunk) {
        if(shouldRebuild(currentChunk)) {
            chunk = currentChunk
            player.client.write(RebuildRegionNormal(player, gpi = false))
        }
    }

    fun getRegionXteaKeys(): List<Int> {
        val xteas = mutableListOf<Int>()
        val isOnTutorialIsland = onTutorialIsland(chunk.x / 8, chunk.y / 8)
        for(x in chunk.x.regionStart..chunk.x.regionEnd) {
            for(y in chunk.y.regionStart..chunk.y.regionEnd) {
                if(!isOnTutorialIsland ||
                        x != 49 && y != 149 && y != 147 && x != 50 && (x != 49 || y != 47)) {
                    val regionId = (x shl 8) or y
                    val xteaKeys = XteaConfig.regionKeys(regionId)
                    xteas.addAll(xteaKeys.toList())
                }
            }
        }
        return xteas
    }

    internal fun synchronize() {
        val currentChunk = world.getChunk(player.tile)
        checkReload(currentChunk)
    }

    companion object {
        /**
         * The number of chunks of the player's scene.
         */
        const val SIZE = 13

        /**
         * The distance to the edge of the player's scene.
         */
        val DISTANCE = SIZE shr 1

        /**
         * The number of chunks from the edge of the current
         * scene which a player's scene will be rebuilt.
         *
         * (2 chunks or 16 tiles)
         */
        const val REBUILD_DISTANCE = 2

        private val Int.regionStart: Int get() = (this - DISTANCE) / 8

        private val Int.regionEnd: Int get() = (this + DISTANCE) / 8

        private fun onTutorialIsland(regionX: Int, regionY: Int): Boolean {
            return ((regionX == 48 || regionX == 49) && regionY == 48) || (regionX == 48 && regionY == 148)
        }
    }
}