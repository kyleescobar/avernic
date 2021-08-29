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
}