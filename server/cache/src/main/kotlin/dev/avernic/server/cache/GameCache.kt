@file:Suppress("UNCHECKED_CAST")

package dev.avernic.server.cache

import io.guthix.js5.Js5Cache
import io.guthix.js5.container.Js5Container
import io.guthix.js5.container.Js5Store
import io.guthix.js5.container.disk.Js5DiskStore
import java.nio.file.Path

class GameCache(private val directory: Path) {

    val store = Js5DiskStore.open(directory)
    val cache = Js5Cache(store)

    val archiveCrcs = mutableListOf<Int>()
    val archiveCount get() = cache.archiveCount

    fun load() {
        val validator = cache.generateValidator(includeWhirlpool = false, includeSizes = false)
        val container = Js5Container(validator.encode())

        store.write(
            indexId = Js5Store.MASTER_INDEX,
            containerId = Js5Store.MASTER_INDEX,
            data = container.encode()
        )

        archiveCrcs.addAll(validator.archiveValidators.map { it.crc })
    }
}