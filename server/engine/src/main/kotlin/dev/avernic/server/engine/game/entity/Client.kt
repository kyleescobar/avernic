package dev.avernic.server.engine.game.entity

import dev.avernic.server.engine.net.Session

class Client(val session: Session) {

    val player: Player = Player(this)

    var resizableMode: Boolean = false
    var width: Int = 0
    var height: Int = 0

}