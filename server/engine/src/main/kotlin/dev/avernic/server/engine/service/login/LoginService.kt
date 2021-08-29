package dev.avernic.server.engine.service.login

import com.google.common.util.concurrent.ThreadFactoryBuilder
import dev.avernic.server.config.ServerConfig
import dev.avernic.server.engine.game.entity.Client
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.net.login.LoginRequest
import dev.avernic.server.engine.service.Service
import org.tinylog.kotlin.Logger
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.Executors
import java.util.concurrent.LinkedBlockingQueue

class LoginService : Service {

    private val executor = Executors.newFixedThreadPool(ServerConfig.LOGIN_QUEUE_THREADS, ThreadFactoryBuilder()
        .setDaemon(false)
        .setNameFormat("login-queue")
        .build()
    )

    private val loginQueue = LinkedBlockingQueue<LoginRequest>()

    private var isShutdown = false

    override fun start() {
        Logger.info("Starting login service on ${ServerConfig.LOGIN_QUEUE_THREADS} threads.")

        /*
         * Start a worker task for each thread.
         */
        repeat(ServerConfig.LOGIN_QUEUE_THREADS) {
            executor.execute { processLoginQueue() }
        }
    }

    override fun stop() {
        isShutdown = true
        executor.shutdownNow()
    }

    fun queueLoginRequest(request: LoginRequest) {
        loginQueue.add(request)
    }

    private fun processLoginQueue() {
        while(!isShutdown) {
            val request = loginQueue.take()

            /*
             * TODO: Player data serialization here
             */

            val client = Client(request.session)
            val player = client.player

            /*
             * Handoff login handling to the player object.
             */
            player.login(request)
        }
    }
}