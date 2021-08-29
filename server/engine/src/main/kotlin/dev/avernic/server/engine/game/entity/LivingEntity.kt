package dev.avernic.server.engine.game.entity

import dev.avernic.server.common.inject
import dev.avernic.server.engine.game.Size
import dev.avernic.server.engine.game.World
import dev.avernic.server.engine.game.map.Tile

abstract class LivingEntity : Entity {

    val world: World by inject()

    override var index: Int = -1

    override var size: Size = Size(width = 1, height = 1)

    override var tile: Tile = Tile(0, 0, 0)

    open var prevTile: Tile = Tile(0, 0, 0)

    override var orientation: Int = 0

    open var running: Boolean = false

    open var interacting: LivingEntity? = null

}