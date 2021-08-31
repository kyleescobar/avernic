package dev.avernic.server.engine.event.player

import dev.avernic.server.engine.event.PlayerEvent
import dev.avernic.server.engine.game.MovementType
import dev.avernic.server.engine.game.entity.Player

class PlayerMoveEvent(player: Player, val type: MovementType) : PlayerEvent(player)