package dev.avernic.server.engine.game.entity.update

import dev.avernic.server.engine.game.entity.Npc
import io.netty.buffer.ByteBuf

class NpcUpdateFlag(
    priority: Int,
    mask: Int,
    val encode: ByteBuf.(Npc) -> Unit
) : UpdateFlag(priority, mask) {
    /*
     * NPC Update flag encoders.
     */

}