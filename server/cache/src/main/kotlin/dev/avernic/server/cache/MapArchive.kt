package dev.avernic.server.cache

import dev.avernic.server.cache.map.RegionDefinition
import dev.avernic.server.cache.xtea.MapXtea
import io.guthix.js5.Js5Archive
import java.io.FileNotFoundException

class MapArchive(val regions: Map<Int, RegionDefinition>) {
    companion object {
        const val id: Int = 5

        fun load(archive: Js5Archive, xteas: List<MapXtea>): MapArchive {
            val mapSquares = mutableMapOf<Int, RegionDefinition>()
            xteas.forEach {
                val mapFile = archive.readGroup("m${it.x}_${it.y}").files[0] ?: throw FileNotFoundException(
                    "Map file not found for map m${it.x}_${it.y}."
                )
                val locFile = archive.readGroup("l${it.x}_${it.y}", it.key).files[0] ?: throw FileNotFoundException(
                    "Loc file not found for loc l${it.x}_${it.y}."
                )
                mapSquares[it.id] = RegionDefinition.decode(mapFile.data, locFile.data, it.x, it.y)
            }
            return MapArchive(mapSquares)
        }
    }
}