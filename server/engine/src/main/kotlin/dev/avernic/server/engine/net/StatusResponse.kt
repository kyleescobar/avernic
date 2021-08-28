package dev.avernic.server.engine.net

enum class StatusResponse(val opcode: Int) : Message {
    SUCCESSFUL(0),
    DELAY(1),
    NORMAL(2),
    INVALID_CREDENTIALS(3),
    ACCOUNT_DISABLED(4),
    ACCOUNT_ONLINE(5),
    OUT_OF_DATE(6),
    WORLD_FULL(7),
    SERVER_OFFLINE(8),
    BAD_SESSION_ID(10),
    ACCOUNT_LOCKED(11),
    MEMBERS_WORLD(12),
    COULD_NOT_COMPLETE_LOGIN(13);
}