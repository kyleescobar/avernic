package dev.avernic.server.engine.net.js5

import dev.avernic.server.engine.net.Message

data class JS5Request(val archive: Int, val group: Int) : Message