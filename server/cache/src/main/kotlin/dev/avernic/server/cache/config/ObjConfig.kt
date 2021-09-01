package dev.avernic.server.cache.config

import io.guthix.buffer.readStringCP1252
import io.netty.buffer.ByteBuf
import java.io.IOException

data class ObjConfig(override val id: Int) : Config(id) {
    var name: String = "null"
    var width: Short = 1
    var length: Short = 1
    var mapIconId: Int? = null
    val options: Array<String?> = arrayOfNulls(5)
    var clipType: Int = 2
    var isClipped: Boolean = true
    var modelClipped: Boolean = false
    var isHollow: Boolean = false
    var impenetrable: Boolean = true
    var accessBlock: Short = 0
    var objectModels: IntArray? = null
    var objectTypes: ShortArray? = null
    var colorReplace: IntArray? = null
    var colorFind: IntArray? = null
    var textureFind: IntArray? = null
    var textureReplace: IntArray? = null
    var anInt2088: Short? = null
    var animationId: Int? = null
    var ambient: Byte = 0
    var contrast: Int = 0
    var mapSceneId: Int? = null
    var modelSizeX: Int = 128
    var modelSizeHeight: Int = 128
    var modelSizeY: Int = 128
    var offsetX: Short = 0
    var offsetHeight: Short = 0
    var offsetY: Short = 0
    var decorDisplacement: Short = 16
    var isMirrored: Boolean = false
    var obstructsGround: Boolean = false
    var nonFlatShading: Boolean = false
    var contouredGround: Int? = null
    var supportItems: Short? = null
    var transformVarbit: Int? = null
    var transformVarp: Int? = null
    var transforms: Array<Int?>? = null
    var ambientSoundId: Int? = null
    var anInt2112: Int = 0
    var anInt2113: Int = 0
    var anInt2083: Short = 0
    var anIntArray2084: IntArray? = null
    var category: Int? = null
    var randomizeAnimationStart = false
    var params: MutableMap<Int, Any>? = null

    companion object : ConfigCompanion<ObjConfig>() {
        override val id: Int = 6

        override fun decode(id: Int, data: ByteBuf): ObjConfig {
            val objConfig = ObjConfig(id)
            decoder@ while (true) {
                when (val opcode = data.readUnsignedByte().toInt()) {
                    0 -> break@decoder
                    1 -> {
                        val size = data.readUnsignedByte().toInt()
                        if (size > 0) {
                            objConfig.objectModels = IntArray(size)
                            objConfig.objectTypes = ShortArray(size)
                            for (i in 0 until size) {
                                objConfig.objectModels!![i] = data.readUnsignedShort()
                                objConfig.objectTypes!![i] = data.readUnsignedByte()
                            }
                        }
                    }
                    2 -> objConfig.name = data.readStringCP1252()
                    5 -> {
                        val size = data.readUnsignedByte().toInt()
                        if (size > 0) {
                            objConfig.objectTypes = null
                            objConfig.objectModels = IntArray(size) { data.readUnsignedShort() }
                        }
                    }
                    14 -> objConfig.width = data.readUnsignedByte()
                    15 -> objConfig.length = data.readUnsignedByte()
                    17 -> {
                        objConfig.clipType = 0
                        objConfig.impenetrable = false
                    }
                    18 -> objConfig.impenetrable = false
                    19 -> objConfig.anInt2088 = data.readUnsignedByte()
                    21 -> objConfig.contouredGround = 0
                    22 -> objConfig.nonFlatShading = true
                    23 -> objConfig.modelClipped = true
                    24 -> {
                        objConfig.animationId = data.readUnsignedShort()
                        if (objConfig.animationId!!.toInt() == 65535) {
                            objConfig.animationId = null
                        }
                    }
                    27 -> objConfig.clipType = 1
                    28 -> objConfig.decorDisplacement = data.readUnsignedByte()
                    29 -> objConfig.ambient = data.readByte()
                    39 -> objConfig.contrast = data.readByte().toInt() * 25
                    in 30..34 -> objConfig.options[opcode - 30] = data.readStringCP1252().takeIf { it != "Hidden" }
                    40 -> {
                        val colorsSize = data.readUnsignedByte().toInt()
                        val colorFind = IntArray(colorsSize)
                        val colorReplace = IntArray(colorsSize)
                        for (i in 0 until colorsSize) {
                            colorFind[i] = data.readUnsignedShort()
                            colorReplace[i] = data.readUnsignedShort()
                        }
                        objConfig.colorFind = colorFind
                        objConfig.colorReplace = colorReplace
                    }
                    41 -> {
                        val texturesSize = data.readUnsignedByte().toInt()
                        val textureFind = IntArray(texturesSize)
                        val textureReplace = IntArray(texturesSize)
                        for (i in 0 until texturesSize) {
                            textureFind[i] = data.readUnsignedShort()
                            textureReplace[i] = data.readUnsignedShort()
                        }
                        objConfig.textureFind = textureFind
                        objConfig.textureReplace = textureReplace
                    }
                    61 -> objConfig.category = data.readUnsignedShort()
                    62 -> objConfig.isMirrored = true
                    64 -> objConfig.isClipped = false
                    65 -> objConfig.modelSizeX = data.readUnsignedShort()
                    66 -> objConfig.modelSizeHeight = data.readUnsignedShort()
                    67 -> objConfig.modelSizeY = data.readUnsignedShort()
                    68 -> objConfig.mapSceneId = data.readUnsignedShort()
                    69 -> objConfig.accessBlock = data.readUnsignedByte()
                    70 -> objConfig.offsetX = data.readShort()
                    71 -> objConfig.offsetHeight = data.readShort()
                    72 -> objConfig.offsetY = data.readShort()
                    73 -> objConfig.obstructsGround = true
                    74 -> objConfig.isHollow = true
                    75 -> objConfig.supportItems = data.readUnsignedByte()
                    77, 92 -> {
                        val transformVarbit = data.readUnsignedShort()
                        objConfig.transformVarbit = if (transformVarbit == 65535) null else transformVarbit
                        val transformVarp = data.readUnsignedShort()
                        objConfig.transformVarp = if (transformVarbit == 65535) null else transformVarp
                        val lastEntry = if (opcode == 92) {
                            val entry = data.readUnsignedShort()
                            if (entry == 65535) null else entry
                        } else null
                        val size = data.readUnsignedByte().toInt()
                        val transforms = arrayOfNulls<Int?>(size + 2)
                        for (i in 0..size) {
                            val transform = data.readUnsignedShort()
                            transforms[i] = if (transform == 65535) null else transform
                        }
                        if (opcode == 92) {
                            transforms[size + 1] = lastEntry
                        }
                        objConfig.transforms = transforms
                    }
                    78 -> {
                        objConfig.ambientSoundId = data.readUnsignedShort()
                        objConfig.anInt2083 = data.readUnsignedByte()
                    }
                    79 -> {
                        objConfig.anInt2112 = data.readUnsignedShort()
                        objConfig.anInt2113 = data.readUnsignedShort()
                        objConfig.anInt2083 = data.readUnsignedByte()
                        val size = data.readUnsignedByte().toInt()
                        objConfig.anIntArray2084 = IntArray(size) { data.readUnsignedShort() }
                    }
                    81 -> objConfig.contouredGround = data.readUnsignedByte() * 256
                    82 -> objConfig.mapIconId = data.readUnsignedShort()
                    89 -> objConfig.randomizeAnimationStart = true
                    249 -> objConfig.params = data.readParams()
                    else -> throw IOException("Did not recognise opcode $opcode.")
                }
            }
            if (objConfig.anInt2088 == null) {
                objConfig.anInt2088 = 0
                if ((objConfig.objectModels != null && (objConfig.objectTypes == null)
                            || objConfig.objectTypes?.get(0)?.toInt() == 10)
                ) {
                    objConfig.anInt2088 = 1
                }
                for (it in (0 until 5).filter { objConfig.options[it] != null }) {
                    objConfig.anInt2088 = 1
                }
            }
            if (objConfig.supportItems == null) {
                objConfig.supportItems = if (objConfig.clipType != 0) 1 else 0
            }
            if (objConfig.isHollow) {
                objConfig.clipType = 0
                objConfig.impenetrable = false
            }
            return objConfig
        }
    }
}