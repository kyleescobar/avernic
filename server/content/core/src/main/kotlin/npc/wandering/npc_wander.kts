import dev.avernic.server.engine.event.on_event
import dev.avernic.server.engine.event.world.NpcSpawnEvent
import dev.avernic.server.engine.game.entity.pathfinder.destination.TileDestination
import kotlin.random.Random

on_event<NpcSpawnEvent>()
    .where { npc.wanderRadius > 0 }
    .then {
        npc.queue {
            while(true) {
                wait(ticks = Random.nextInt(20))
                val minX = npc.spawnTile.x - npc.wanderRadius
                val maxX = npc.spawnTile.x + npc.wanderRadius
                val minY = npc.spawnTile.y - npc.wanderRadius
                val maxY = npc.spawnTile.y + npc.wanderRadius
                val walkX = Random.nextInt(minX, maxX)
                val walkY = Random.nextInt(minY, maxY)
                npc.path = npc.pathfinder.calculatePath(npc.tile, TileDestination(walkX, walkY))
            }
        }
    }