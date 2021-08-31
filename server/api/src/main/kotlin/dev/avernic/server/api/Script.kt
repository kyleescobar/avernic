package dev.avernic.server.api

import dev.avernic.server.cache.GameCache
import dev.avernic.server.common.inject
import dev.avernic.server.engine.Engine
import dev.avernic.server.engine.game.World
import kotlin.script.experimental.annotations.KotlinScript

@KotlinScript(fileExtension = "kts")
abstract class Script {

    /**
     * The loaded game cache singleton.
     */
    val cache: GameCache by inject()

    /**
     * The game engine singleton instance.
     */
    val engine: Engine by inject()

    /**
     * The game server's world instance.
     */
    val world: World by inject()

}