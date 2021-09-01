package dev.avernic.server.engine.game.entity

import dev.avernic.server.engine.game.map.Tile

interface Entity {

    val tile: Tile

    var orientation: Int

}