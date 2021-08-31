package dev.avernic.server.api.entity

import dev.avernic.server.api.task.ChatTask
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.entity.update.PlayerUpdateFlag

fun Player.updateAppearance() {
    this.updateFlags.add(PlayerUpdateFlag.APPEARANCE)
}

fun Player.forceChat(message: String) {
    this.chatMessage = message
    this.updateFlags.add(PlayerUpdateFlag.FORCE_CHAT)
    cancelTasks(ChatTask)
    addTask(ChatTask) {
        wait(ticks = 3)
        addPostTask { chatMessage = null }
    }
}