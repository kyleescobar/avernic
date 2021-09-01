package dev.avernic.server.engine.game

enum class MessageType(val id: Int) {
    GAME(0),
    MOD_CHAT(1),
    PRIVATE_CHAT(3),
    ENGINE(4),
    PRIVATE_CHAT_OUT(6),
    MOD_PRIVATE_CHAT(7),
    FRIENDS_CHAT(9),
    BROADCAST(14),
    CONSOLE(99),
    TRADE(102),
    SPAM(105),
    PLAYER(106),
    FILTERED(109);
}