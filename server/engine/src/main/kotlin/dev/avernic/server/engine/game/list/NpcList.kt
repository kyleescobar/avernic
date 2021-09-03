package dev.avernic.server.engine.game.list

import dev.avernic.server.engine.game.entity.Npc
import dev.avernic.server.engine.game.map.Tile
import java.util.*

class NpcList(val capacity: Int) : Iterable<Npc> {
    private val entries = arrayOfNulls<Npc>(capacity)
    private val occupiedIndexes = mutableListOf<Int>()
    private val freeIndexes = Stack<Int>()

    val size: Int get() = occupiedIndexes.size

    init {
        for(index in capacity downTo 1) {
            freeIndexes.push(index)
        }
    }

    fun add(id: Int, tile: Tile): Npc {
        val index = freeIndexes.pop()
        val npc = Npc(id, index, tile)
        entries[npc.index] = npc
        occupiedIndexes.add(npc.index)
        return npc
    }

    fun add(npc: Npc): Npc {
        entries[npc.index] = npc
        occupiedIndexes.add(npc.index)
        return npc
    }

    fun remove(npc: Npc) {
        entries[npc.index] = null
        occupiedIndexes.remove(npc.index)
        freeIndexes.add(npc.index)
        npc.index = -1
    }

    operator fun get(index: Int): Npc? = entries[index]

    override fun iterator(): Iterator<Npc> = IndexIterator()

    inner class IndexIterator : MutableIterator<Npc> {
        internal var currentIndex = 0

        override fun hasNext(): Boolean {
            return currentIndex < occupiedIndexes.size
        }

        override fun next(): Npc {
            return entries[currentIndex++] ?: next()
        }

        override fun remove() {
            val npc = entries[currentIndex]
            npc!!.index = -1
            entries[currentIndex] = null
            occupiedIndexes.remove(currentIndex)
            freeIndexes.add(currentIndex)
        }
    }
}