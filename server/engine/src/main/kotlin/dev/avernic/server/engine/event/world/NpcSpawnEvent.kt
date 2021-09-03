package dev.avernic.server.engine.event.world

import dev.avernic.server.engine.event.WorldEvent
import dev.avernic.server.engine.game.entity.Npc

class NpcSpawnEvent(val npc: Npc) : WorldEvent()