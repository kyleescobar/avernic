package dev.avernic.server.engine

import dev.avernic.server.common.inject
import dev.avernic.server.engine.game.World
import org.tinylog.kotlin.Logger

class Engine {

    val world: World by inject()

    fun start() {
        Logger.info("Starting game engine...")

    }

    fun stop() {
        Logger.info("Stopping game engine...")

    }
}