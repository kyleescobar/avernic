package dev.avernic.server.launcher

import dev.avernic.server.cache.GameCache
import dev.avernic.server.common.get
import dev.avernic.server.config.ServerConfig
import dev.avernic.server.config.XteaConfig
import dev.avernic.server.util.RSA
import org.koin.core.context.startKoin
import org.tinylog.kotlin.Logger
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.util.zip.ZipFile
import kotlin.system.exitProcess

object ServerSetup {

    private val DATA_DIR = Paths.get("data/")

    @JvmStatic
    fun main(args: Array<String>) {
        Logger.info("Setting up Avernic server...")

        /*
         * If the data directory already exists. Fail the setup.
         */
        if(Files.exists(DATA_DIR)) {
            Logger.error("The data/ directory already exists. Please remove it and re-run the setup gradle task.")
            exitProcess(0)
        }

        /*
         * Start dependency injector.
         */
        startKoin { modules(DI_MODULES) }

        createDirs()
        extractDefaultData()
        createConfigs()
        generateRSAKeyPair()
        verifyCache()
    }

    private fun createDirs() {
        Logger.info("Creating default directory structure...")

        listOf(
            "cache/",
            "logs/",
            "saves/",
            "configs/",
            "rsa/",
            "xteas/"
        ).map { DATA_DIR.resolve(it) }.forEach { dir ->
            if(!Files.exists(dir)) {
                Logger.info("Creating directory: '$dir'.")
                Files.createDirectories(dir)
            }
        }
    }

    private fun extractDefaultData() {
        Logger.info("Extracting default data to respective directories...")

        val file = File("default_data.zip")
        ZipFile(file).use { zip ->
            zip.entries().asSequence().forEach { entry ->
                if(!entry.isDirectory) {
                    zip.getInputStream(entry).use { input ->
                        File(entry.name).outputStream().use { output ->
                            Logger.info("Extracting file: '${entry.name}'.")
                            input.copyTo(output)
                        }
                    }
                }
            }
        }
    }

    private fun createConfigs() {
        Logger.info("Creating default server configuration file: 'server.yml'.")
        get<ServerConfig>().load()

        Logger.info("Creating default XTEA keys configuration file: 'xteas.json'.")
        get<XteaConfig>().load()
    }

    private fun generateRSAKeyPair() {
        RSA.generateKeyPair(Paths.get("data/rsa/"))
        get<RSA>().load()
    }

    private fun verifyCache() {
        Logger.info("Verifying game cache files...")
        get<GameCache>().initialize()
    }
}