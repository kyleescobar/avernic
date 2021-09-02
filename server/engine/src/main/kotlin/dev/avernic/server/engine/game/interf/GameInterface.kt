package dev.avernic.server.engine.game.interf

import dev.avernic.server.cache.GameCache
import dev.avernic.server.cache.config.EnumConfig
import dev.avernic.server.common.inject

enum class GameInterface(
    val interfaceId: Int,
    val childId: Int,
    val type: InterfaceType = InterfaceType.OVERLAY
) {
    CHAT_BOX(interfaceId = 162, childId = 38, type = InterfaceType.OVERLAY),
    UNKNOWN1(interfaceId = 651, childId = 7, type = InterfaceType.OVERLAY),
    //UNKNOWN3(interfaceId = 708, childId = 8, type = InterfaceType.OVERLAY),
    USERNAME(interfaceId = 163, childId = 16, type = InterfaceType.OVERLAY),
    //UNKNOW5(interfaceId = 303, childId = 4, type = InterfaceType.OVERLAY),
    MINI_MAP(interfaceId = 160, childId = 37, type = InterfaceType.OVERLAY),
    XP_ORBS(interfaceId = 122, childId = 11, type = InterfaceType.OVERLAY),
    UNKNOWN2(interfaceId = 378, childId = 35, type = InterfaceType.MODAL),
    SKILLS(interfaceId = 320, childId = 80, type = InterfaceType.OVERLAY),
    QUESTS(interfaceId = 629, childId = 81, type = InterfaceType.OVERLAY),
    INVENTORY(interfaceId = 149, childId = 82, type = InterfaceType.OVERLAY),
    EQUIPMENT(interfaceId = 387, childId = 83, type = InterfaceType.OVERLAY),
    PRAYER(interfaceId = 541, childId = 84, type = InterfaceType.OVERLAY),
    SPELL_BOOK(interfaceId = 218, childId = 85, type = InterfaceType.OVERLAY),
    SOCIAL(interfaceId = 429, childId = 88, type = InterfaceType.OVERLAY),
    ACCOUNT(interfaceId = 109, childId = 87, type = InterfaceType.OVERLAY),
    LOG_OUT(interfaceId = 182, childId = 89, type = InterfaceType.OVERLAY),
    SETTINGS(interfaceId = 116, childId = 90, type = InterfaceType.OVERLAY),
    EMOTES(interfaceId = 216, childId = 91, type = InterfaceType.OVERLAY),
    MUSIC(interfaceId = 239, childId = 92, type = InterfaceType.OVERLAY),
    CLANS(interfaceId = 707, childId = 86, type = InterfaceType.OVERLAY),
    COMBAT(interfaceId = 593, childId = 79, type = InterfaceType.OVERLAY);

    private val cache: GameCache by inject()

    @Suppress("UNCHECKED_CAST")
    fun getChildId(displayMode: DisplayMode): Int? {
        val mappings = cache.configArchive.enumConfigs[displayMode.enumId]!!.entryMap as Map<EnumConfig.Component, EnumConfig.Component>
        return mappings[EnumConfig.Component(DisplayMode.RESIZABLE_CLASSIC.id, childId)]?.child
    }

    companion object {
        private val cache: GameCache by inject()

        val values = enumValues<GameInterface>()

        private val modalKey = EnumConfig.Component(161, 15)

        @Suppress("UNCHECKED_CAST")
        fun getModalChildId(displayMode: DisplayMode): Int {
            val mappings = cache.configArchive.enumConfigs[displayMode.enumId]!!.entryMap as Map<EnumConfig.Component, EnumConfig.Component>
            return mappings[modalKey]?.child ?: throw IllegalArgumentException("Failed to get modal child id mapping.")
        }

        @Suppress("UNCHECKED_CAST")
        fun fromChild(displayMode: DisplayMode, child: Int): GameInterface? {
            val mappings = cache.configArchive.enumConfigs[displayMode.enumId]!!.entryMap.mapValues { it.key } as Map<EnumConfig.Component, EnumConfig.Component>
            val keyChild = mappings[EnumConfig.Component(displayMode.id, child)]?.child ?: return null
            return values.firstOrNull { it.childId == keyChild }
        }
    }
}