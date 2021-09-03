package dev.avernic.server.engine.game

import dev.avernic.server.cache.GameCache
import dev.avernic.server.cache.map.MapObjectDefinition
import dev.avernic.server.cache.map.MapTerrainDefinition
import dev.avernic.server.common.inject
import dev.avernic.server.engine.event.*
import dev.avernic.server.engine.event.world.NpcSpawnEvent
import dev.avernic.server.engine.game.collision.Collision
import dev.avernic.server.engine.game.collision.addObjectCollision
import dev.avernic.server.engine.game.entity.GameObject
import dev.avernic.server.engine.game.entity.Npc
import dev.avernic.server.engine.game.list.NpcList
import dev.avernic.server.engine.game.list.PlayerList
import dev.avernic.server.engine.game.map.Chunk
import dev.avernic.server.engine.game.map.Region
import dev.avernic.server.engine.game.map.Tile
import dev.avernic.server.engine.game.map.WorldChunk
import dev.avernic.server.engine.task.Task
import dev.avernic.server.engine.task.TaskSubject
import dev.avernic.server.engine.task.TaskType
import org.tinylog.kotlin.Logger
import java.util.concurrent.LinkedBlockingDeque

class World : EventSubject, TaskSubject {

    private val cache: GameCache by inject()

    var tick: Long = 0L

    val players = PlayerList(MAX_PLAYERS)

    val npcs = NpcList(MAX_NPCS)

    override val events = LinkedBlockingDeque<EventHandler<Event>>()

    override val tasks = mutableMapOf<TaskType, MutableSet<Task>>()

    internal val chunks = Array(4) { Array(2048) { arrayOfNulls<WorldChunk?>(2048) } }

    internal fun initialize() {
        Logger.info("Loading the game world...")

        /*
         * Load the world chunks and terrain collision.
         */
        cache.mapArchive.regions.forEach { (_, region) ->
            (0 until MAX_PLANES).forEach { plane ->
                (0 until Chunk.SIZE).map { region.x * Chunk.SIZE + it }.forEach { x ->
                    (0 until Chunk.SIZE).map { region.y * Chunk.SIZE + it }.forEach { y ->
                        chunks[plane][x][y] = WorldChunk(x, y, plane)
                    }
                }
            }
        }

        cache.mapArchive.regions.forEach { (_, region) ->
            addTerrainCollision(region.x, region.y, region.terrain)
            region.objects.forEach { addStaticObjectCollision(region.x, region.y, it) }
        }

        val chunkCount = chunks.sumOf { plane -> plane.sumOf { y -> y.count { it != null } } }

        Logger.info("Loaded $chunkCount world chunks.")
    }

    /**
     * The game world cycle logic.
     */
    internal fun gameLogic() {
        // Process client packets
        players.forEach { it.client.processPackets() }

        // World
        processTasks()

        // Npc
        processNpcTasks()
        processNpcMovement()

        // Player
        processPlayerTasks()
        processPlayerMovement()

        // Synchronize
        synchronize()

        // Post
        postProcess()

        tick++
    }

    private fun processTasks() {
        while(true) {
            while(events.isNotEmpty()) events.poll().handle()
            val resume = tasks.values.flatMap { it.toList().map(Task::run) }
            if(resume.all { !it } && events.isEmpty()) break
        }
    }

    private fun processPlayerTasks() {
        players.forEach { it.processTasks() }
    }

    private fun processNpcTasks() {
        npcs.forEach { it.processTasks() }
    }

    private fun processPlayerMovement() {
        players.forEach { it.processMovement() }
    }

    private fun processNpcMovement() {
        npcs.forEach { it.processMovement() }
    }

    private fun synchronize() {
        players.forEach { it.synchronize() }
        players.forEach { it.postProcess() }
    }

    fun spawnNpc(id: Int, tile: Tile): Npc {
        val npc = npcs.add(id, tile)
        EventBus.dispatch(NpcSpawnEvent(npc))
        return npc
    }

    fun spawnNpc(npc: Npc): Npc {
        npcs.add(npc)
        npc.isDead = false
        return npc
    }

    fun removeNpc(npc: Npc): Npc {
        npcs.remove(npc)
        npc.isDead = true
        return npc
    }

    fun findNpcsWithinRadius(tile: Tile, radius: Int): List<Npc> {
        val result = mutableListOf<Npc>()
        for(x in tile.x - radius .. tile.x + radius) {
            for(y in tile.y - radius .. tile.x + radius) {
                result.addAll(npcs.filter { it.tile.x == x && it.tile.y == y && it.tile.plane == tile.plane })
            }
        }
        return result
    }

    fun getChunk(x: Int, y: Int, plane: Int = 0): WorldChunk? = chunks[plane][x / Chunk.SIZE][y / Chunk.SIZE]

    fun getChunk(tile: Tile): WorldChunk? = chunks[tile.plane][tile.toChunk().x][tile.toChunk().y]

    fun getChunk(chunk: Chunk): WorldChunk? = chunks[chunk.plane][chunk.x][chunk.y]

    private fun addTerrainCollision(regionX: Int, regionY: Int, terrain: MapTerrainDefinition) {
        terrain.renderRules.forEachIndexed { plane, planeRenderRules ->
            planeRenderRules.forEachIndexed { x, verticalRenderRules ->
                verticalRenderRules.forEachIndexed { y, currentRule ->
                    var z = plane
                    if(currentRule.toInt() and MapTerrainDefinition.BLOCKED_TILE_MASK.toInt() == 1) {
                        if(terrain.renderRules[1][x][y].toInt() and MapTerrainDefinition.LINK_BELOW_TILE_MASK.toInt() == 2) {
                            z--
                        }
                        if(z >= 0) {
                            val chunk = getChunk((regionX * Region.SIZE) + x, (regionY * Region.SIZE) + y, z)
                            chunk?.addCollision(x % Chunk.SIZE, y % Chunk.SIZE, Collision.MASK_TERRAIN_BLOCK)
                        }
                    }
                }
            }
        }
    }

    private fun addStaticObjectCollision(regionX: Int, regionY: Int, obj: MapObjectDefinition) {
        val gameObj = GameObject(
            obj.id,
            obj.type,
            Tile((regionX * Region.SIZE) + obj.localX, (regionY * Region.SIZE) + obj.localY, obj.plane),
            obj.orientation
        )
        addStaticObject(gameObj)
    }

    private fun addStaticObject(obj: GameObject) {
        val chunk = getChunk(obj.tile)
        chunk?.staticObjects?.set(obj.hash, obj)
        addObjectCollision(obj)
    }

    companion object {

        /**
         * The maximum number of players allowed in the game world.
         */
        const val MAX_PLAYERS = 2048

        /**
         * The maximum number of npcs allowed in the game world.
         */
        const val MAX_NPCS = 32768

        /**
         * The maximum number of planes or height levels the world supports.
         */
        const val MAX_PLANES = 4
    }
}