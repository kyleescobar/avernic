package dev.avernic.server.launcher

import org.koin.core.context.startKoin
import org.tinylog.kotlin.Logger
import java.io.File
import kotlin.system.exitProcess

object ServerLauncher {

    @JvmStatic
    fun main(args: Array<String>) {
        /*
         * Check that the server has been set up.
         */
        if(!checkSetup()) {
            Logger.error("The server has not been setup. Please run the 'setup server' gradle and try starting the server again.")
            exitProcess(0)
        }

        initialize()
        launch()
    }

    private fun checkSetup(): Boolean {
        return File("data/setup.txt").exists()
    }

    private fun initialize() {
        Logger.info("Initializing...")

        /*
         * Start the dependency injector.
         */
        startKoin { modules(DI_MODULES) }
    }

    private fun launch() {
        Logger.info("Preparing to launch Avernic server.")

    }
}