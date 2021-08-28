package dev.avernic.server.config

import com.uchuhimo.konf.Config
import com.uchuhimo.konf.ConfigSpec
import com.uchuhimo.konf.Item
import com.uchuhimo.konf.source.yaml
import com.uchuhimo.konf.source.yaml.toYaml
import dev.avernic.server.common.inject
import java.io.File

class ServerConfig {

    private var config = Config()

    private val file = File("data/configs/server.yml")

    fun load() {
        if(!file.exists()) {
            config = Config { addSpec(Spec) }
            save()
        }

        config = Config { addSpec(Spec) }.from.yaml.file(file)
        save()
    }

    fun save() {
        config.toYaml.toFile(file)
    }

    operator fun <T> get(item: Item<T>): T = config[item]

    operator fun <T> set(item: Item<T>, value: T) {
        config[item] = value
    }

    object Spec : ConfigSpec("server") {
        val serverName by optional("Avernic", "server-name")
        val revision by optional(198, "revision")
        val developerMode by optional(true, "developer-mode")
        val tickInterval by optional(600L, "tick-interval")

        object Network : ConfigSpec("network") {
            val address by optional("0.0.0.0", "address")
            val port by optional(43594, "port")
        }

        object Defaults : ConfigSpec("defaults") {
            object HomeTile : ConfigSpec("home-tile") {
                val x by optional(3221, "x")
                val y by optional(3218, "y")
                val plane by optional(0, "plane")
            }
        }
    }

    companion object {
        private val config: ServerConfig by inject()

        init {
            config.load()
        }

        val SERVER_NAME get() = config[Spec.serverName]
        val REVISION get() = config[Spec.revision]
        val DEVELOPER_MODE get() = config[Spec.developerMode]
        val TICK_INTERVAL get() = config[Spec.tickInterval]

        val NETWORK = NetworkCompanion(config)
        class NetworkCompanion(private val config: ServerConfig) {
            val ADDRESS get() = config[Spec.Network.address]
            val PORT get() = config[Spec.Network.port]
        }

        val DEFAULTS = DefaultsCompanion(config)
        class DefaultsCompanion(private val config: ServerConfig) {
            val HOME_TILE = HomeTileCompanion(config)
            class HomeTileCompanion(private val config: ServerConfig) {
                val X get() = config[Spec.Defaults.HomeTile.x]
                val Y get() = config[Spec.Defaults.HomeTile.y]
                val PLANE get() = config[Spec.Defaults.HomeTile.plane]
            }
        }
    }
}