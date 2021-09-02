package dev.avernic.server.engine.event.player

import dev.avernic.server.engine.event.PlayerEvent
import dev.avernic.server.engine.game.entity.Player

class InterfaceCloseEvent(player: Player, val interfaceId: Int) : PlayerEvent(player)