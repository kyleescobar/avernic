package dev.avernic.server.launcher

import dev.avernic.server.config.ConfigModule
import dev.avernic.server.engine.EngineModule

val DI_MODULES = listOf(
    ConfigModule,
    EngineModule
)