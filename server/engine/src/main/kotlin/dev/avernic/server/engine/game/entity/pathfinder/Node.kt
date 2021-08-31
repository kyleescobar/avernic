package dev.avernic.server.engine.game.entity.pathfinder

import dev.avernic.server.engine.game.map.Tile

data class Node(val tile: Tile, var parent: Node? = null, var cost: Int = 0)