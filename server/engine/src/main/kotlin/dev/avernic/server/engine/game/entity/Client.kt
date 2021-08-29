package dev.avernic.server.engine.game.entity

import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.game.Packet
import java.util.*

class Client(val session: Session) {

    internal val packetQueue = LinkedList<Packet>()

    val player: Player = Player(this)

    var resizableMode: Boolean = false
    var width: Int = 0
    var height: Int = 0

    fun write(packet: Packet) {
        session.write(packet)
    }

    fun writeAndFlush(packet: Packet) {
        session.writeAndFlush(packet)
    }

    fun flush() {
        session.flush()
    }

}