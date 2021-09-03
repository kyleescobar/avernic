package dev.avernic.server.engine.event.player.interf

import dev.avernic.server.engine.event.PlayerEvent
import dev.avernic.server.engine.game.entity.Player

class InterfaceOpenEvent(player: Player, val interfaceId: Int) : PlayerEvent(player)