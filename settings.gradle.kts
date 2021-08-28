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
