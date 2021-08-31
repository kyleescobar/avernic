import java.nio.file.Files

plugins {
    id("de.fayard.refreshVersions") version "0.20.0"
}

rootProject.name = "avernic"

include(":client")
include(":server")
include(":server:common")
include(":server:util")
include(":server:launcher")
include(":server:config")
include(":server:cache")
include(":server:engine")
include(":server:api")
include(":server:content")
includeModules(":server:content")

fun includeModules(project: String) {
    val parent = project(project).projectDir.toPath()
    Files.walk(parent).forEach { path ->
        if(!Files.isDirectory(path)) {
            return@forEach
        }

        if(!Files.exists(path.resolve("build.gradle.kts"))) {
            return@forEach
        }

        val relativePath = parent.relativize(path)
        val moduleName = relativePath.toString().replace(File.separator, ":")
        val projectName = project.substring(1)

        include("$projectName:$moduleName")
    }
}