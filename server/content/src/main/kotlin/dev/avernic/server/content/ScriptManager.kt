package dev.avernic.server.content

import dev.avernic.server.api.Script
import io.github.classgraph.ClassGraph
import org.tinylog.kotlin.Logger

object ScriptManager {

    private val loadedScripts = mutableListOf<Script>()

    fun loadContentScripts() {
        Logger.info("Scanning for game content scripts...")

        ClassGraph()
            .enableClassInfo()
            .scan()
            .use { result ->
                val scriptList = result.getSubclasses(Script::class.qualifiedName).directOnly()
                scriptList.forEach {
                    val script = it.loadClass(Script::class.java).getDeclaredConstructor().newInstance()
                    loadedScripts.add(script)
                }
            }

        Logger.info("Successfully loaded ${loadedScripts.size} game content scripts.")
    }
}