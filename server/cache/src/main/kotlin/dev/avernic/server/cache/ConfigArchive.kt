package dev.avernic.server.cache

import dev.avernic.server.cache.config.*
import io.guthix.js5.Js5Archive

class ConfigArchive(
    val npcConfigs: Map<Int, NpcConfig>,
    val enumConfigs: Map<Int, EnumConfig<Any, Any>>,
    val objConfigs: Map<Int, ObjConfig>,
    val varbitConfigs: Map<Int, VarbitConfig>,
    val varClientConfigs: Map<Int, VarClientConfig>,
    val varPlayerConfigs: Map<Int, VarPlayerConfig>
) {
    companion object {
        const val id: Int = 2

        fun load(archive: Js5Archive): ConfigArchive = ConfigArchive(
            NpcConfig.load(archive.readGroup(NpcConfig.id)),
            EnumConfig.load(archive.readGroup(EnumConfig.id)),
            ObjConfig.load(archive.readGroup(ObjConfig.id)),
            VarbitConfig.load(archive.readGroup(VarbitConfig.id)),
            VarClientConfig.load(archive.readGroup(VarClientConfig.id)),
            VarPlayerConfig.load(archive.readGroup(VarPlayerConfig.id))
        )
    }
}