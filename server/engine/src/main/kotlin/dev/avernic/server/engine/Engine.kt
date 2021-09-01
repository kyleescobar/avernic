package dev.avernic.server.engine

import com.google.common.util.concurrent.ThreadFactoryBuilder
import dev.avernic.server.cache.GameCache
import dev.avernic.server.common.get
import dev.avernic.server.common.inject
import dev.avernic.server.config.ServerConfig
import dev.avernic.server.engine.event.EventBus
import dev.avernic.server.engine.event.schedule
import dev.avernic.server.engine.event.world.ServerStartEvent
import dev.avernic.server.engine.event.world.ServerStopEvent
import dev.avernic.server.engine.game.World
import dev.avernic.server.engine.net.game.GamePackets
import dev.avernic.server.engine.service.ServiceManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.tinylog.kotlin.Logger
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

class Engine {

    private val serviceManager: ServiceManager by inject()

    val world: World by inject()

    private val gameExecutor = Executors.newSingleThreadScheduledExecutor(ThreadFactoryBuilder()
        .setDaemon(false)
        .setNameFormat("game")
        .setUncaughtExceptionHandler { t, e -> Logger.error(e) { "An error occurred in the game thread $t." } }
        .build()
    )

    private val gameCoroutine = CoroutineScope(gameExecutor.asCoroutineDispatcher())

    var state = EngineState.STOPPED

    private var excessCycleNanos = 0L

    fun start() {
        Logger.info("Starting game engine...")

        state = EngineState.RUNNING

        /*
         * Register game packets.
         */
        GamePackets.loadPackets()

        /*
         * Load the game world.
         */
        world.initialize()

        /*
         * Start the game cycle coroutine.
         */
        gameCoroutine.start(ServerConfig.TICK_INTERVAL)

        /*
         * Start game engine services.
         */
        serviceManager.initialize()
        serviceManager.startServices()

        /*
         * Dispatch the event.
         */
        EventBus.schedule(ServerStartEvent())
    }

    fun stop() {
        Logger.info("Stopping game engine...")

        state = EngineState.STOPPED

        /*
         * Stop game engine services.
         */
        serviceManager.stopServices()

        /*
         * Stop the game coroutine cycle.
         */
        gameExecutor.shutdownNow()

        /*
         * Dispatch Event
         */
        EventBus.schedule(ServerStopEvent())
    }

    private fun CoroutineScope.start(delay: Long) = launch {
        while(state == EngineState.RUNNING) {
            val elapsedNanos = measureNanoTime { world.gameLogic() } + excessCycleNanos
            val elapsedMillis = TimeUnit.NANOSECONDS.toMillis(elapsedNanos)
            val isOverdue = elapsedMillis > delay
            val sleepTime = if(isOverdue) {
                val elapsedCycleCount = elapsedMillis / delay
                val nextCycleDelay = (elapsedCycleCount + 1) * delay
                nextCycleDelay - elapsedMillis
            } else {
                delay - elapsedMillis
            }

            if(isOverdue) {
                Logger.warn("Game tick took longer than expected (active=${elapsedMillis}ms, idle=${sleepTime}ms). Is the server overloaded?")
            }

            excessCycleNanos = elapsedNanos - TimeUnit.MILLISECONDS.toNanos(elapsedMillis)
            delay(sleepTime)
        }
    }
}