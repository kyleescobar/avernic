@file:Suppress("UNCHECKED_CAST")

package dev.avernic.server.engine.net.game

import io.github.classgraph.ClassGraph
import org.tinylog.kotlin.Logger
import kotlin.reflect.KClass
import kotlin.reflect.full.companionObjectInstance

object GamePackets {

    val CLIENT = PacketRegistry()
    val SERVER = PacketRegistry()

    internal fun loadPackets() {
        Logger.info("Scanning for game packets...")

        loadClientPackets()
        loadServerPackets()

        Logger.info("Registered ${CLIENT.size} CLIENT game packets.")
        Logger.info("Registered ${SERVER.size} SERVER game packets.")
    }

    private fun loadClientPackets() {
        ClassGraph()
            .enableClassInfo()
            .enableAnnotationInfo()
            .acceptPackages("dev.avernic.server.engine.net.packet.client")
            .scan()
            .use { result ->
                result.getClassesWithAnnotation(ClientPacket::class.qualifiedName).forEach { classInfo ->
                    val annotation = classInfo.getAnnotationInfo(ClientPacket::class.qualifiedName).loadClassAndInstantiate() as ClientPacket
                    val opcode = annotation.opcode
                    val length = annotation.length
                    val packetClass = classInfo.loadClass().kotlin as KClass<Packet>
                    val codec = packetClass.companionObjectInstance as Codec<Packet>

                    CLIENT.register(packetClass, opcode, length, codec)
                }
            }
    }

    private fun loadServerPackets() {
        ClassGraph()
            .enableClassInfo()
            .enableAnnotationInfo()
            .acceptPackages("dev.avernic.server.engine.net.packet.server")
            .scan()
            .use { result ->
                result.getClassesWithAnnotation(ServerPacket::class.qualifiedName).forEach { classInfo ->
                    val annotation = classInfo.getAnnotationInfo(ServerPacket::class.qualifiedName).loadClassAndInstantiate() as ServerPacket
                    val opcode = annotation.opcode
                    val packetType = annotation.type
                    val packetClass = classInfo.loadClass().kotlin as KClass<Packet>
                    val codec = packetClass.companionObjectInstance as Codec<Packet>
                    val length = packetType.length

                    SERVER.register(packetClass, opcode, length, codec)
                }
            }
    }

    /**
     * A list of the client packet lengths. This is used to skip inbound client
     * packets which are not implemented.
     */
    internal val CLIENT_LENGTHS = mutableMapOf<Int, Int>(
        0 to 13,
        1 to -2,
        2 to -1,
        3 to 1,
        4 to 8,
        5 to 7,
        6 to -1,
        7 to 3,
        8 to 4,
        9 to 5,
        10 to 8,
        11 to 2,
        12 to -1,
        13 to -1,
        14 to 0,
        15 to 7,
        16 to 3,
        17 to 6,
        18 to -1,
        19 to -1,
        20 to 8,
        21 to -1,
        22 to 0,
        23 to -1,
        24 to 2,
        25 to -1,
        26 to 3,
        27 to 7,
        28 to 11,
        29 to 7,
        30 to 11,
        31 to 15,
        32 to 7,
        33 to 3,
        34 to 7,
        35 to 15,
        36 to 7,
        37 to 7,
        38 to -1,
        39 to 2,
        40 to 7,
        41 to -1,
        42 to 3,
        43 to 10,
        44 to 3,
        45 to 8,
        46 to -1,
        47 to 3,
        48 to 3,
        49 to 8,
        50 to 7,
        51 to 6,
        52 to 8,
        53 to 8,
        54 to 8,
        55 to 15,
        56 to 8,
        57 to 4,
        58 to 2,
        59 to 4,
        60 to 0,
        61 to -2,
        62 to 3,
        63 to -1,
        64 to 3,
        65 to 3,
        66 to 16,
        67 to 8,
        68 to 0,
        69 to 3,
        70 to 9,
        71 to 4,
        72 to 9,
        73 to 8,
        74 to -1,
        75 to 8,
        76 to 16,
        77 to 8,
        78 to -2,
        79 to 11,
        80 to 14,
        81 to -1,
        82 to 8,
        83 to -1,
        84 to 0,
        85 to 2,
        86 to 8,
        87 to -1,
        88 to -1,
        89 to 4,
        90 to 3,
        91 to 8,
        92 to -1,
        93 to 11,
        94 to 8,
        95 to -1,
        96 to 8,
        97 to 8,
        98 to 3,
        99 to 16,
        100 to -1,
        101 to -1,
        102 to 15,
        103 to -1,
        104 to 7,
        105 to 8
    )
}