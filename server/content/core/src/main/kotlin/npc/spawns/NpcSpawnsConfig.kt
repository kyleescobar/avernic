package npc.spawns

import com.charleskorn.kaml.PolymorphismStyle
import com.charleskorn.kaml.Yaml
import com.charleskorn.kaml.YamlConfiguration
import dev.avernic.server.engine.game.map.Tile
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import org.tinylog.kotlin.Logger
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.stream.Collectors

class NpcSpawnsConfig {

    val spawns = mutableListOf<NpcSpawn>()

    fun load() {
        val entries = readYaml<List<NpcSpawnEntry>>("/npc_spawns.yml")
        entries.forEach { data ->
            spawns.add(NpcSpawn(data.id, Tile(data.x, data.y, data.plane), data.wander))
        }

        Logger.info("Successfully loaded ${spawns.size} NPC spawn locations.")
    }

    private inline fun <reified T> Any.readYaml(path: String): T {
        val input = javaClass.getResourceAsStream(path).use { stream ->
            BufferedReader(InputStreamReader(stream)).lines().parallel().collect(Collectors.joining("\n"))
        }

        return Yaml(
            configuration = YamlConfiguration(encodeDefaults = false, polymorphismStyle = PolymorphismStyle.Property),
        ).decodeFromString(input)
    }

    @Serializable
    data class NpcSpawnEntry(val name: String?, val id: Int, val plane: Int, val x: Int, val y: Int, val wander: Int = 0)

    data class NpcSpawn(val id: Int, val tile: Tile, val wanderRadius: Int)

    companion object {
        private const val FILE_NAME = "/npc_spawns.yml"
    }
}