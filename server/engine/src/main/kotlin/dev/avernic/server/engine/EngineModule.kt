package dev.avernic.server.engine

import dev.avernic.server.cache.GameCache
import dev.avernic.server.engine.game.World
import dev.avernic.server.engine.net.NetworkServer
import dev.avernic.server.engine.service.ServiceManager
import dev.avernic.server.util.RSA
import org.koin.dsl.module
import java.nio.file.Paths

val EngineModule = module {
    single { GameCache(Paths.get("data/cache/")) }
    single { RSA(Paths.get("data/rsa/")) }
    single { Engine() }
    single { World() }
    single { NetworkServer() }
    single { ServiceManager() }
}