package dev.avernic.server.engine.game.manager

import dev.avernic.server.engine.event.EventBus
import dev.avernic.server.engine.event.player.InterfaceCloseEvent
import dev.avernic.server.engine.event.player.InterfaceOpenEvent
import dev.avernic.server.engine.event.schedule
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.interf.DisplayMode
import dev.avernic.server.engine.game.interf.GameInterface
import dev.avernic.server.engine.game.interf.InterfaceType
import dev.avernic.server.engine.net.packet.server.IfMoveSub
import dev.avernic.server.engine.net.packet.server.IfOpenSub
import dev.avernic.server.engine.net.packet.server.IfOpenTop
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap

class InterfaceManager(private val player: Player) {

    private val interfaces = Int2IntOpenHashMap()
    private var currentModal: Int = -1
    private var currentDisplayMode = DisplayMode.RESIZABLE_CLASSIC

    private fun open(parent: Int, child: Int, interfaceId: Int) {
        val hash = (parent shl 16) or child
        if(interfaces.containsKey(hash)) {
            close(hash)
        }
        interfaces[hash] = interfaceId
        EventBus.schedule(InterfaceOpenEvent(player, interfaceId))
    }

    private fun close(hash: Int): Int {
        val interfaceId = interfaces.remove(hash)
        if(interfaceId != interfaces.defaultReturnValue()) {
            EventBus.schedule(InterfaceCloseEvent(player, interfaceId))
            return interfaceId
        }
        return -1
    }

    private fun openModal(parent: Int, child: Int, interfaceId: Int) {
        open(parent, child, interfaceId)
        currentModal = interfaceId
    }

    private fun isOccupied(parent: Int, child: Int): Boolean = interfaces.containsKey((parent shl 16) or child)

    fun isInterfaceOpen(interfaceId: Int): Boolean = interfaces.values.contains(interfaceId)

    fun getInterfaceAt(parent: Int, child: Int): Int = interfaces.getOrDefault((parent shl 16) or child, -1)

    internal fun initialize() {
        /*
         * Open the initial resizable classic interface.
         */
        openTopInterface(currentDisplayMode.id)

        /*
         * Open each game interface.
         */
        GameInterface.values.forEach { gameInterface ->
            openInterface(gameInterface)
        }

        /*
         * Update the current display mode to the player's configured
         * display mode by sending the child id mappings via IfMoveSub packet.
         */
        updateDisplayMode()
    }

    fun openTopInterface(interfaceId: Int) {
        open(interfaceId, 0, interfaceId)
        player.client.write(IfOpenTop(interfaceId))
    }

    fun openInterface(parent: Int, child: Int, interfaceId: Int, type: InterfaceType = InterfaceType.MODAL) {
        if(type == InterfaceType.MODAL) {
            openModal(parent, child, interfaceId)
        } else {
            open(parent, child, interfaceId)
        }
        player.client.write(IfOpenSub(parent, child, interfaceId, type))
    }

    fun openInterface(interfaceId: Int, gameInterface: GameInterface) {
        val parent = currentDisplayMode.id
        val child = gameInterface.getChildId(currentDisplayMode) ?: return
        openInterface(parent, child, interfaceId, InterfaceType.MODAL)
    }

    fun openInterface(gameInterface: GameInterface) {
        val parent = currentDisplayMode.id
        val child = gameInterface.getChildId(currentDisplayMode) ?: return
        openInterface(parent, child, gameInterface.interfaceId, gameInterface.type)
    }

    fun updateDisplayMode() {
        /*
         * Open the current player's display mode top interface.
         */
        openTopInterface(player.displayMode.id)

        /*
         * Send the IfMoveSub packet to remap all child interfaces
         */
        interfaces.keys.forEach { component ->
            val fromParent = component shr 16
            val fromChild = component and 0xFFFF
            val toParent = player.displayMode.id
            val toChild = GameInterface.fromChild(currentDisplayMode, fromChild)?.getChildId(player.displayMode)
            if(toChild != null) {
                player.client.write(IfMoveSub(fromParent, fromChild, toParent, toChild))
            }
        }

        /*
         * Send the client script to the player to enable or disable resizable window mode.
         */
        when(player.displayMode) {
            DisplayMode.RESIZABLE_CLASSIC,
            DisplayMode.RESIZABLE_MODERN -> {
                player.runClientScript(3998, 1)
            }
            else -> {
                player.runClientScript(3998, 0)
            }
        }

        /*
         * Update the current display mode state.
         */
        currentDisplayMode = player.displayMode
    }
}