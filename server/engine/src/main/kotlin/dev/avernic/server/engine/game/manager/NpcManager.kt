package dev.avernic.server.engine.game.manager

import dev.avernic.server.engine.game.entity.Npc
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.entity.update.NpcUpdateTask
import dev.avernic.server.engine.net.packet.server.UpdateNpcSmall

class NpcManager(
    private val player: Player,
    private val npcs: MutableList<Npc> = mutableListOf()
) : MutableList<Npc> by npcs {

    internal fun synchronize() {
        val buf = player.client.session.channel.alloc().buffer()
        val task = NpcUpdateTask(player)
        task.execute(buf)

        /*
         * Send the NPC update task's data in the UpdateNpcSmall packet to the client.
         */
        player.client.write(UpdateNpcSmall(buf))
    }

}