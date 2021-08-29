package dev.avernic.server.engine.net.game

import kotlin.reflect.KClass

class PacketRegistry {

    private val packetMap = mutableMapOf<KClass<Packet>, Int>()
    private val codecMap = mutableMapOf<Int, Codec<Packet>>()
    private val lengthMap = mutableMapOf<Int, Int>()

    val size: Int get() = packetMap.size

    internal fun register(packet: KClass<Packet>, opcode: Int, length: Int, codec: Codec<Packet>) {
        packetMap[packet] = opcode
        codecMap[opcode] = codec
        lengthMap[opcode] = length
    }

    fun getOpcode(packet: KClass<out Packet>): Int = packetMap[packet]!!

    fun getCodec(opcode: Int): Codec<Packet> = codecMap[opcode]!!

    fun getLength(opcode: Int): Int = lengthMap[opcode] ?: -255

    fun getPacketType(opcode: Int): PacketType = when(getLength(opcode)) {
        -1 -> PacketType.VARIABLE_BYTE
        -2 -> PacketType.VARIABLE_SHORT
        else -> PacketType.FIXED
    }

    fun isUnknown(opcode: Int): Boolean = !lengthMap.containsKey(opcode)

}