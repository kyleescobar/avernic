package dev.avernic.server.engine.service

import dev.avernic.server.engine.service.login.LoginService
import org.tinylog.kotlin.Logger
import kotlin.reflect.KClass

class ServiceManager {

    private val services = mutableMapOf<KClass<out Service>, Service>()

    val size: Int get() = services.values.size

    internal fun initialize() {
        register<LoginService>()
    }

    fun startServices() {
        Logger.info("Starting game engine services...")

        services.values.forEach { service ->
            service.start()
        }

        Logger.info("Successfully started $size game engine services.")
    }

    fun stopServices() {
        Logger.info("Stopping game engine services...")

        services.values.forEach { service ->
            service.stop()
        }
    }

    @Suppress("UNCHECKED_CAST")
    operator fun <T : Service> get(service: KClass<T>): T {
        return services[service] as T?
            ?: throw IllegalArgumentException("Unknown or unregistered service: '${service.simpleName}'.")
    }

    private inline fun <reified T : Service> register() {
        val klass = T::class.java
        val inst = klass.getDeclaredConstructor().newInstance() as T
        services[klass.kotlin] = inst
    }
}