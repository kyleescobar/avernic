package dev.avernic.server.engine.game.list

import dev.avernic.server.engine.game.entity.Player
import java.util.*
import kotlin.random.Random

class PlayerList(val capacity: Int) : Iterable<Player> {

    private val entries = arrayOfNulls<Player>(capacity)
    private val occupiedIndexes = mutableListOf<Int>()
    private val freeIndexes = Stack<Int>()

    private val iterator = PidIterator()

    init {
        for(index in capacity downTo 1) {
            freeIndexes.push(index)
        }
    }

    val size: Int get() = occupiedIndexes.size

    fun add(player: Player) {
        val index = freeIndexes.pop()
        val pid = Random.nextInt(occupiedIndexes.size + 1)
        player.index = index
        player.pid = pid
        entries[player.index] = player
        occupiedIndexes.add(pid, player.index)
    }

    fun remove(player: Player) {
        entries[player.index] = null
        occupiedIndexes.remove(player.index)
        freeIndexes.add(player.index)
        player.index = -1
        player.pid = -1
    }

    fun randomizePid() {
        occupiedIndexes.shuffle()
        for(index in occupiedIndexes) {
            entries[index]!!.pid = iterator.currentIndex
        }
    }

    operator fun get(index: Int): Player? = entries[index]

    override fun iterator(): Iterator<Player> {
        return PidIterator()
    }

    inner class PidIterator : MutableIterator<Player> {
        internal var currentIndex = 0

        override fun hasNext(): Boolean {
            return currentIndex < occupiedIndexes.size
        }

        override fun next(): Player {
            return entries[occupiedIndexes[currentIndex++]] ?: next()
        }

        override fun remove() {
            entries[currentIndex] = null
            occupiedIndexes.remove(currentIndex)
            freeIndexes.add(currentIndex)
        }
    }
}