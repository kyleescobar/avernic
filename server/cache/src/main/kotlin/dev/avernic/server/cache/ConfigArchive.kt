package dev.avernic.server.cache

import dev.avernic.server.cache.config.EnumConfig
import io.guthix.js5.Js5Archive

class ConfigArchive(
    val enumConfigs: Map<Int, EnumConfig<Any, Any>>
) {
    companion object {
        const val id: Int = 2

        fun load(archive: Js5Archive): ConfigArchive = ConfigArchive(
            EnumConfig.load(archive.readGroup(EnumConfig.id))
        )
    }
}