package dev.avernic.server.cache

import dev.avernic.server.cache.config.EnumConfig
import dev.avernic.server.cache.config.VarClientConfig
import dev.avernic.server.cache.config.VarPlayerConfig
import dev.avernic.server.cache.config.VarbitConfig
import io.guthix.js5.Js5Archive

class ConfigArchive(
    val enumConfigs: Map<Int, EnumConfig<Any, Any>>,
    val varbitConfigs: Map<Int, VarbitConfig>,
    val varClientConfigs: Map<Int, VarClientConfig>,
    val varPlayerConfigs: Map<Int, VarPlayerConfig>
) {
    companion object {
        const val id: Int = 2

        fun load(archive: Js5Archive): ConfigArchive = ConfigArchive(
            EnumConfig.load(archive.readGroup(EnumConfig.id)),
            VarbitConfig.load(archive.readGroup(VarbitConfig.id)),
            VarClientConfig.load(archive.readGroup(VarClientConfig.id)),
            VarPlayerConfig.load(archive.readGroup(VarPlayerConfig.id))
        )
    }
}