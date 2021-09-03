package npc.wandering

import com.charleskorn.kaml.PolymorphismStyle
import com.charleskorn.kaml.Yaml
import com.charleskorn.kaml.YamlConfiguration
import com.uchuhimo.konf.Config
import com.uchuhimo.konf.ConfigSpec
import com.uchuhimo.konf.Spec
import com.uchuhimo.konf.source.yaml
import com.uchuhimo.konf.toValue
import dev.avernic.server.common.inject
import dev.avernic.server.engine.game.World
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import org.tinylog.kotlin.Logger
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.stream.Collectors

object NpcWander {

    private val world: World by inject()

    private const val FILE_NAME = "/npc_wander_radius.yml"

    fun updateNpcs() {
        Logger.info("Updating NPCs wandering radius values.")

        val wanderMap = mutableMapOf<Int, Int>()

        val entries = readYaml<Map<String, NpcWanderData>>(FILE_NAME)
        entries.forEach { (_, data) ->
            data.ids.forEach {
                wanderMap[it] = data.radius
            }
        }

        var count = 0
        world.npcs.forEach { npc ->
            if(npc.wanderRadius > 0) return@forEach
            npc.wanderRadius = wanderMap[npc.id] ?: 0
            if(npc.wanderRadius > 0) count++
        }

        Logger.info("Updated $count NPC wandering radius values.")
    }

    @Serializable
    data class NpcWanderData(val ids: IntArray, val radius: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as NpcWanderData

            if (!ids.contentEquals(other.ids)) return false
            if (radius != other.radius) return false

            return true
        }

        override fun hashCode(): Int {
            var result = ids.contentHashCode()
            result = 31 * result + radius
            return result
        }
    }

    private inline fun <reified T> Any.readYaml(path: String): T {
        val input = javaClass.getResourceAsStream(path).use { stream ->
            BufferedReader(InputStreamReader(stream)).lines().parallel().collect(Collectors.joining("\n"))
        }

        return Yaml(
            configuration = YamlConfiguration(encodeDefaults = false, polymorphismStyle = PolymorphismStyle.Property),
        ).decodeFromString(input)
    }
}