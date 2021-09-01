package dev.avernic.server.engine.game.manager

import dev.avernic.server.cache.GameCache
import dev.avernic.server.common.inject
import dev.avernic.server.engine.game.entity.Player
import dev.avernic.server.engine.net.packet.server.UpdateVarpLarge
import dev.avernic.server.engine.net.packet.server.UpdateVarpSmall
import kotlin.math.pow

class VarpManager(private val player: Player) {

    private val cache: GameCache by inject()
    private val varbitConfigs = cache.configArchive.varbitConfigs

    val varps = mutableMapOf<Int, Int>()

    private val changes = mutableMapOf<Int, Int>()

    fun updateVarp(id: Int, value: Int) {
        varps[id] = value
        changes[id] = value
    }

    fun updateVarbit(id: Int, value: Int) {
        val varbit = varbitConfigs[id] ?: throw IllegalArgumentException("Unknown varbit with id: $id.")
        val bitsize = (varbit.msb - varbit.lsb) + 1

        if(value > 2.0.pow(bitsize) - 1) {
            throw IllegalArgumentException("Value $value is too large for varbit with id: $id.")
        }

        var currentVarp = varps[varbit.varpId] ?: 0
        currentVarp = currentVarp.clearBits(varbit.lsb.toInt(), varbit.msb.toInt())
        currentVarp = currentVarp or value shl varbit.lsb.toInt()
        varps[varbit.varpId] = currentVarp
        changes[varbit.varpId] = currentVarp
    }

    internal fun synchronize() {
        changes.forEach { (id, value) ->
            if(value <= Byte.MIN_VALUE || value >= Byte.MAX_VALUE) {
                player.client.write(UpdateVarpLarge(id, value))
            } else {
                player.client.write(UpdateVarpSmall(id, value))
            }
        }
    }

    internal fun postProcess() {
        changes.clear()
    }

    companion object {

        private fun Int.setBits(lsb: Int, msb: Int): Int = this xor ((1 shl (msb + 1)) - 1) xor ((1 shl lsb) - 1)

        @Suppress("INTEGER_OVERFLOW")
        private fun Int.clearBits(lsb: Int, msb: Int): Int = ((1 shl 4 * 8 - 1) - 1).setBits(lsb, msb) and this


    }
}