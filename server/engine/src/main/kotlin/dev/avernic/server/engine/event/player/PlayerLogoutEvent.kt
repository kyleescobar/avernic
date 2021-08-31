package dev.avernic.server.engine.event.player

import dev.avernic.server.engine.event.PlayerEvent
import dev.avernic.server.engine.game.entity.Player

class PlayerLogoutEvent(player: Player) : PlayerEvent(player)