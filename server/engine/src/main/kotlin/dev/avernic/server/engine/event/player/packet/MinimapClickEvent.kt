package dev.avernic.server.engine.event.player.packet

import dev.avernic.server.engine.event.PlayerEvent
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.map.Tile

class MinimapClickEvent(player: Player, val tile: Tile) : PlayerEvent(player)