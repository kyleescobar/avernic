package dev.avernic.server.engine.event.player

import dev.avernic.server.engine.event.PlayerEvent
import dev.avernic.server.engine.game.entity.Player

class CommandEvent(player: Player, val command: String, val args: List<String>) : PlayerEvent(player) {
}