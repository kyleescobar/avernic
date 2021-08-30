package dev.avernic.server.engine.game.manager

import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.game.interf.DisplayMode
import dev.avernic.server.engine.game.interf.GameInterface
import dev.avernic.server.engine.game.interf.InterfaceType
import dev.avernic.server.engine.net.packet.server.IfOpenSub
import dev.avernic.server.engine.net.packet.server.IfOpenTop
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap

class InterfaceManager(private val player: Player) {

    private val visible = Int2IntOpenHashMap()
    private var currentDisplayMode: DisplayMode = player.displayMode
    private var currentModal = -1

    internal fun initialize() {
        openTopInterface(currentDisplayMode)

        GameInterface.values.forEach { gameInterface ->
            openInterface(gameInterface)
        }
    }

    private fun open(parent: Int, child: Int, interfaceId: Int) {
        val hash = (parent shl 16) or child
        if(visible.containsKey(hash)) {
            close(hash)
        }
        visible[hash] = interfaceId
    }

    private fun close(parent: Int, child: Int): Int = close((parent shl 16) or child)

    private fun close(hash: Int): Int {
        val found = visible.remove(hash)
        if(found != visible.defaultReturnValue()) {
            return found
        }
        return -1
    }

    private fun openModal(parent: Int, child: Int, interfaceId: Int) {
        open(parent, child, interfaceId)
        currentModal = interfaceId
    }

    fun openTopInterface(displayMode: DisplayMode) {
        val hash = displayMode.id shl 16
        visible[hash] = displayMode.id
        player.client.write(IfOpenTop(displayMode.id))
    }

    fun openInterface(gameInterface: GameInterface) {
        val parent = currentDisplayMode.id
        val child = gameInterface.getChildId(currentDisplayMode)
        val interfaceId = gameInterface.interfaceId
        openInterface(parent, child, interfaceId, gameInterface.type)
    }

    fun openInterface(interfaceId: Int, gameInterface: GameInterface) {
        val parent = currentDisplayMode.id
        val child = gameInterface.getChildId(currentDisplayMode)
        openInterface(parent, child, interfaceId, gameInterface.type)
    }

    fun openInterface(parent: Int, child: Int, interfaceId: Int, type: InterfaceType = InterfaceType.MODAL) {
        this.open(parent, child, interfaceId)
        player.client.write(IfOpenSub(parent, child, interfaceId, type))
    }
}