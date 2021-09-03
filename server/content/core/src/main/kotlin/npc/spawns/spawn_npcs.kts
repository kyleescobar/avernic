import dev.avernic.server.engine.event.on_event
import dev.avernic.server.engine.event.world.ServerStartEvent
import dev.avernic.server.engine.game.World
import npc.spawns.NpcSpawnsConfig
import npc.wandering.NpcWander
import org.tinylog.kotlin.Logger

on_event<ServerStartEvent> { event ->
    val npcSpawnsConfig = NpcSpawnsConfig()
    npcSpawnsConfig.load()

    /*
     * Spawn all of the NPCs from the npc_spawns.yml into the game world.
     */
    event.world.spawnNpcs(npcSpawnsConfig.spawns)
}

fun World.spawnNpcs(spawns: List<NpcSpawnsConfig.NpcSpawn>) {
    Logger.info("Spawning all NPCs in the game world.")

    spawns.forEach { data ->
        val npc = this.spawnNpc(data.id, data.tile)
        npc.wanderRadius = data.wanderRadius
    }

    NpcWander.updateNpcs()

    Logger.info("Successfully spawned ${spawns.size} NPCs into the game world.")
}