package dev.avernic.server.config

import org.koin.dsl.module

val ConfigModule = module {
    single { ServerConfig() }
    single { XteaConfig() }
}