package dev.avernic.server.engine.game.entity

import dev.avernic.server.engine.game.map.Tile

interface Entity {

    var index: Int

    var tile: Tile

    var orientation: Int

}