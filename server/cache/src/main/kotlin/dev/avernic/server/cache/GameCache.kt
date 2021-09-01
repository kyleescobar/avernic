@file:Suppress("UNCHECKED_CAST")

package dev.avernic.server.cache

import dev.avernic.server.cache.xtea.MapXtea
import dev.avernic.server.common.inject
import dev.avernic.server.config.XteaConfig
import io.guthix.js5.Js5Cache
import io.guthix.js5.container.Js5Container
import io.guthix.js5.container.Js5Store
import io.guthix.js5.container.disk.Js5DiskStore
import java.nio.file.Path

class GameCache(private val directory: Path) {

    private val xteaConfig: XteaConfig by inject()

    val store = Js5DiskStore.open(directory)
    val cache = Js5Cache(store)

    val archiveCrcs = mutableListOf<Int>()
    val archiveCount get() = cache.archiveCount

    /**
     * Loaded cache archive models.
     */

    lateinit var configArchive: ConfigArchive private set
    lateinit var mapArchive: MapArchive private set

    fun load() {
        val validator = cache.generateValidator(includeWhirlpool = false, includeSizes = false)
        val container = Js5Container(validator.encode())

        store.write(
            indexId = Js5Store.MASTER_INDEX,
            containerId = Js5Store.MASTER_INDEX,
            data = container.encode()
        )

        archiveCrcs.addAll(validator.archiveValidators.map { it.crc })

        this.loadArchives()
    }

    private fun loadArchives() {
        configArchive = ConfigArchive.load(cache.readArchive(ConfigArchive.id))
        mapArchive = MapArchive.load(cache.readArchive(MapArchive.id), xteaConfig.xteas.map { MapXtea(it.key, it.value) })
    }
}