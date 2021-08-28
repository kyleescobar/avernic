package dev.avernic.server.engine.game.entity

import dev.avernic.server.engine.game.map.Tile

abstract class LivingEntity : Entity {

    override var index: Int = -1

    override var tile: Tile = Tile(0, 0, 0)


}