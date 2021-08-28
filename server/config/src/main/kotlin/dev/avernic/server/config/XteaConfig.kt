package dev.avernic.server.config

import com.uchuhimo.konf.Config
import com.uchuhimo.konf.toValue
import dev.avernic.server.common.inject
import org.tinylog.kotlin.Logger
import java.io.File
import kotlin.system.exitProcess

class XteaConfig {

    private var config = Config()
    private val file = File("data/xteas/xteas.json")

    val xteas = mutableMapOf<Int, IntArray>()

    fun load() {
        if(!file.exists()) {
            Logger.error("Could not find region XTEA keys config file at 'data/xteas/xteas.json'. Make sure you have run the 'setup server' task.")
            exitProcess(0)
        }

        val entries = config.from.json.file(file).toValue<Array<XteaEntry>>()
        entries.forEach { xteas[it.mapsquare] = it.key }
    }

    operator fun get(regionId: Int): IntArray {
        return xteas[regionId] ?: IntArray(4) { 0 }
    }

    data class XteaEntry(val mapsquare: Int, val key: IntArray) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as XteaEntry

            if (mapsquare != other.mapsquare) return false
            if (!key.contentEquals(other.key)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = mapsquare
            result = 31 * result + key.contentHashCode()
            return result
        }
    }

    companion object {
        private val config: XteaConfig by inject()

        fun regionKeys(regionId: Int): IntArray = config[regionId]
    }
}