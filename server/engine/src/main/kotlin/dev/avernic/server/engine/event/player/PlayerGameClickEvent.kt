package dev.avernic.server.engine.event.player

import dev.avernic.server.engine.event.PlayerEvent
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.map.Tile

class PlayerGameClickEvent(player: Player, val tile: Tile) : PlayerEvent(player)