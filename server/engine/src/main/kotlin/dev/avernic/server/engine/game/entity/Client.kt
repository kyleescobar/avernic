package dev.avernic.server.engine.game.entity

import dev.avernic.server.engine.net.Session

class Client(val session: Session) {

    val player: Player = Player(this)

    var resizableMode: Boolean = false
    var clientWidth: Int = 0
    var clientHeight: Int = 0

}