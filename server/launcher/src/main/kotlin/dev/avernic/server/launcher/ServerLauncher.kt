package dev.avernic.server.launcher

import dev.avernic.server.cache.GameCache
import dev.avernic.server.common.get
import dev.avernic.server.config.ServerConfig
import dev.avernic.server.config.XteaConfig
import dev.avernic.server.content.ScriptManager
import dev.avernic.server.engine.Engine
import dev.avernic.server.engine.event.EventBus
import dev.avernic.server.engine.event.dispatch
import dev.avernic.server.engine.event.world.ServerStartEvent
import dev.avernic.server.engine.net.NetworkServer
import dev.avernic.server.util.RSA
import org.koin.core.context.startKoin
import org.tinylog.kotlin.Logger
import java.net.InetSocketAddress

object ServerLauncher {

    @JvmStatic
    fun main(args: Array<String>) {
        initialize()
        launch()
    }

    private fun initialize() {
        Logger.info("Initializing...")

        /*
         * Start the dependency injector.
         */
        startKoin { modules(DI_MODULES) }

        loadConfigs()
        loadRSA()
        loadGameCache()
    }

    private fun loadConfigs() {
        Logger.info("Loading server configuration file.")
        get<ServerConfig>().load()
        Logger.info("${ServerConfig.SERVER_NAME} is running for Old School RuneScape revision: ${ServerConfig.SERVER_NAME}.")

        Logger.info("Loading region XTEA keys configuration file.")
        get<XteaConfig>().load()
        Logger.info("Successfully loaded ${get<XteaConfig>().xteas.values.size} region XTEA keys.")
    }

    private fun loadRSA() {
        Logger.info("Loading RSA private key data.")
        get<RSA>().load()
    }

    private fun loadGameCache() {
        Logger.info("Loading game cache files.")
        val cache = get<GameCache>()
        cache.load()
        Logger.info("Successfully loaded ${cache.archiveCount} game cache archives.")
    }

    private fun launch() {
        Logger.info("Preparing server game engine.")

        /*
         * Start the game engine.
         */
        val engine = get<Engine>()
        engine.start()

        /*
         * Load all game content scripts.
         */
        ScriptManager.loadContentScripts()

        /*
         * Start the server networking.
         */
        val networkServer = get<NetworkServer>()
        val address = InetSocketAddress(ServerConfig.NETWORK.ADDRESS, ServerConfig.NETWORK.PORT)
        networkServer.bind(address)

        EventBus.dispatch(ServerStartEvent())
    }
}