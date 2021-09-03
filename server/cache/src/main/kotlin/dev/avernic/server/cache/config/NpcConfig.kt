package dev.avernic.server.cache.config

import io.guthix.buffer.readStringCP1252
import io.netty.buffer.ByteBuf

class NpcConfig(override val id: Int) : Config(id) {
    var name: String = "null"
    var size: Short = 1
    var combatLevel: Int? = null
    var isInteractable: Boolean = true
    var drawMapDot: Boolean = true
    var isClickable: Boolean = true
    var rotation: Int = 32
    var headIcon: Int? = null
    var options: Array<String?> = arrayOfNulls(5)
    var stanceAnimation: Int? = null
    var walkForwardAnimation: Int? = null
    var walkLeftAnimation: Int? = null
    var walkRightAnimation: Int? = null
    var walkBackAnimation: Int? = null
    var turnLeftAnimation: Int? = null
    var turnRightAnimation: Int? = null
    var colorFind: IntArray? = null
    var colorReplace: IntArray? = null
    var textureFind: IntArray? = null
    var textureReplace: IntArray? = null
    var models: IntArray? = null
    var models2: IntArray? = null
    var resizeX: Int = 128
    var resizeY: Int = 128
    var contrast: Int = 0
    var ambient: Byte = 0
    var hasRenderPriority: Boolean = false
    var transformVarbit: Int? = null
    var transformVarp: Int? = null
    var transforms: Array<Int?>? = null
    var unknownBoolean1: Boolean = false
    var category: Int? = null
    var params: MutableMap<Int, Any>? = null

    companion object : ConfigCompanion<NpcConfig>() {
        override val id = 9

        override fun decode(id: Int, data: ByteBuf): NpcConfig {
            val npcConfig = NpcConfig(id)
            decoder@ while(true) {
                when(val opcode = data.readUnsignedByte().toInt()) {
                    0 -> break@decoder
                    1 -> {
                        val length = data.readUnsignedByte().toInt()
                        npcConfig.models = IntArray(length) { data.readUnsignedShort() }
                    }
                    2 -> npcConfig.name = data.readStringCP1252()
                    12 -> npcConfig.size = data.readUnsignedByte()
                    13 -> npcConfig.stanceAnimation = data.readUnsignedShort()
                    14 -> npcConfig.walkForwardAnimation = data.readUnsignedShort()
                    15 -> npcConfig.turnLeftAnimation = data.readUnsignedShort()
                    16 -> npcConfig.turnRightAnimation = data.readUnsignedShort()
                    17 -> {
                        npcConfig.walkForwardAnimation = data.readUnsignedShort()
                        npcConfig.walkBackAnimation = data.readUnsignedShort()
                        npcConfig.walkLeftAnimation = data.readUnsignedShort()
                        npcConfig.walkRightAnimation = data.readUnsignedShort()
                    }
                    18 -> npcConfig.category = data.readUnsignedShort()
                    in 30..34 -> npcConfig.options[opcode - 30] = data.readStringCP1252().takeIf { it != "Hidden" }
                    40 -> {
                        val colorsSize = data.readUnsignedByte().toInt()
                        val colorFind = IntArray(colorsSize)
                        val colorReplace = IntArray(colorsSize)
                        for(i in 0 until colorsSize) {
                            colorFind[i] = data.readUnsignedShort()
                            colorReplace[i] = data.readUnsignedShort()
                        }
                        npcConfig.colorFind = colorFind
                        npcConfig.colorReplace = colorReplace
                    }
                    41 -> {
                        val texturesSize = data.readUnsignedByte().toInt()
                        val textureFind = IntArray(texturesSize)
                        val textureReplace = IntArray(texturesSize)
                        for(i in 0 until texturesSize) {
                            textureFind[i] = data.readUnsignedShort()
                            textureReplace[i] = data.readUnsignedShort()
                        }
                        npcConfig.textureFind = textureFind
                        npcConfig.textureReplace = textureReplace
                    }
                    60 -> {
                        val length = data.readUnsignedByte().toInt()
                        npcConfig.models2 = IntArray(length) { data.readUnsignedShort() }
                    }
                    93 -> npcConfig.drawMapDot = false
                    95 -> npcConfig.combatLevel = data.readUnsignedShort()
                    97 -> npcConfig.resizeX = data.readUnsignedShort()
                    98 -> npcConfig.resizeY = data.readUnsignedShort()
                    99 -> npcConfig.hasRenderPriority = true
                    100 -> npcConfig.ambient = data.readByte()
                    101 -> npcConfig.contrast = data.readByte() * 5
                    102 -> npcConfig.headIcon = data.readUnsignedShort()
                    103 -> npcConfig.rotation = data.readUnsignedShort()
                    106, 118 -> {
                        val transformVarbit = data.readUnsignedShort()
                        npcConfig.transformVarbit = if(transformVarbit == 65535) null else transformVarbit
                        val transformVarp = data.readUnsignedShort()
                        npcConfig.transformVarp = if(transformVarp == 65535) null else transformVarp
                        val lastEntry = if(opcode == 118) {
                            val entry = data.readUnsignedShort()
                            if(entry == 65535) null else entry
                        } else null
                        val size = data.readUnsignedByte().toInt()
                        val transforms = arrayOfNulls<Int?>(size + 2)
                        for(i in 0..size) {
                            val transform = data.readUnsignedShort()
                            transforms[i] = if(transform == 65535) null else transform
                        }
                        if(opcode == 118) {
                            transforms[size + 1] = lastEntry
                        }
                        npcConfig.transforms = transforms
                    }
                    107 -> npcConfig.isInteractable = false
                    109 -> npcConfig.isClickable = false
                    111 -> npcConfig.unknownBoolean1 = true
                    249 -> npcConfig.params = data.readParams()
                    else -> throw IllegalStateException("Unknown opcode $opcode.")
                }
            }
            return npcConfig
        }
    }
}