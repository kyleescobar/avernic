package dev.avernic.server.engine

import dev.avernic.server.common.inject
import dev.avernic.server.engine.game.World
import dev.avernic.server.engine.service.ServiceManager
import org.tinylog.kotlin.Logger

class Engine {

    private val serviceManager: ServiceManager by inject()

    val world: World by inject()

    fun start() {
        Logger.info("Starting game engine...")

        /*
         * Start game engine services.
         */
        serviceManager.startServices()


    }

    fun stop() {
        Logger.info("Stopping game engine...")

        /*
         * Stop game engine services.
         */
        serviceManager.stopServices()

    }
}