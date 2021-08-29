package dev.avernic.server.engine.game.entity

class Player(val client: Client) : LivingEntity() {

    var username: String = ""
    var passwordHash: String = ""
    var displayName: String = ""
}