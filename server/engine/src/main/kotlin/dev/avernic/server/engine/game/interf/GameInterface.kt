package dev.avernic.server.engine.game.interf

import dev.avernic.server.cache.GameCache
import dev.avernic.server.cache.config.EnumConfig
import dev.avernic.server.common.inject

enum class GameInterface(
    val interfaceId: Int,
    val childId: Int,
    val type: InterfaceType = InterfaceType.OVERLAY
) {
    CHAT_BOX(interfaceId = 162, childId = 38),
    USERNAME(interfaceId = 651, childId = 7),
    MINI_MAP(interfaceId = 160, childId = 37),
    XP_ORBS(interfaceId = 122, childId = 11),
    SKILLS(interfaceId = 320, childId = 80),
    QUESTS(interfaceId = 629, childId = 81),
    INVENTORY(interfaceId = 149, childId = 82),
    EQUIPMENT(interfaceId = 387, childId = 83),
    PRAYER(interfaceId = 541, childId = 84),
    SPELL_BOOK(interfaceId = 218, childId = 85),
    SOCIAL(interfaceId = 429, childId = 88),
    ACCOUNT(interfaceId = 109, childId = 87),
    LOG_OUT(interfaceId = 182, childId = 89),
    SETTINGS(interfaceId = 116, childId = 90),
    EMOTES(interfaceId = 216, childId = 91),
    MUSIC(interfaceId = 239, childId = 92),
    CLANS(interfaceId = 707, childId = 86),
    COMBAT(interfaceId = 593, childId = 79);

    private val cache: GameCache by inject()

    @Suppress("UNCHECKED_CAST")
    fun getChildId(displayMode: DisplayMode): Int {
        val mappings = cache.configArchive.enumConfigs[displayMode.enumId]!!.entryMap as Map<EnumConfig.Component, EnumConfig.Component>
        return mappings[EnumConfig.Component(DisplayMode.RESIZABLE_CLASSIC.id, childId)]?.child
            ?: throw IllegalArgumentException("Failed to get a component child id mapping for the game interface: $this.")
    }

    companion object {
        val values = enumValues<GameInterface>()
    }
}