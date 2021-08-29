package dev.avernic.server.engine.game.entity

import dev.avernic.server.engine.game.Appearance
import dev.avernic.server.engine.game.Privilege
import dev.avernic.server.engine.net.login.LoginRequest
import dev.avernic.server.util.SHA256
import org.tinylog.kotlin.Logger

class Player(val client: Client) : LivingEntity() {

    var username: String = ""

    var passwordHash: String = ""

    var displayName: String = ""

    var privilege: Privilege = Privilege.ADMINISTRATOR

    var appearance: Appearance = Appearance.DEFAULT

    var pid: Int = -1

    internal fun login(request: LoginRequest) {
        username = request.username
        displayName = request.username

        if(request.password != null) {
            passwordHash = SHA256.hash(request.password)
        }

        client.resizableMode = request.resizableMode
        client.width = request.clientWidth
        client.height = request.clientHeight

        /*
         * Update the game
         */

        Logger.info("[username: $username] has connected to the server.")
    }

    internal fun logout() {
        client.session.disconnect()
        Logger.info("[username: $username] has disconnected from the server.")
    }
}