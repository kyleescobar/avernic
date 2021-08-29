package dev.avernic.server.engine.net.game

import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.Session

interface Packet : Message {

    fun handle(session: Session) {
        /*
         * Nothing to do.
         */
    }

}