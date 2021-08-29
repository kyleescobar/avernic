package dev.avernic.server.engine.net.login

import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.StatusResponse

data class LoginResponse(val status: StatusResponse, val player: Player) : Message