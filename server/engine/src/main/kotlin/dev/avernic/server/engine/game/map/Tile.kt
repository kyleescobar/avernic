package dev.avernic.server.engine.game.map

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.sqrt

@JvmInline
value class Tile(private val packed: Int) {

    constructor(x: Int, y: Int, plane: Int = 0) : this(
        (x and 0x7FFF) or ((y and 0x7FFF) shl 15) or (plane shl 30)
    )

    val x: Int get() = packed and 0x7FFF

    val y: Int get() = (packed shr 15) and 0x7FFF

    val plane: Int get() = (packed ushr 30)

    val regionId: Int get() = (x shr 6) shl 8 or (y shr 6)

    val regionX: Int get() = x shr 3
    val regionY: Int get() = x shr 3

    val chunkX: Int get() = localX shr 3
    val chunkY : Int get() = localY shr 3

    val localX: Int get() = x - ((x shr 6) shl 6)
    val localY: Int get() = y - ((y shr 6) shl 6)

    val sceneX: Int get() = x - ((regionX - 6) shl 3)
    val sceneY: Int get() = y - ((regionY - 6) shl 3)

    val chunkBase: Tile get() = Tile(regionX shl 3, regionY shl 3, plane)

    val chunkOffsetX: Int get() = localX - ((localX shr 3) shl 3)
    val chunkOffsetY: Int get() = localY - ((localY shr 3) shl 3)

    fun transform(x: Int = 0, y: Int = 0, plane: Int = 0) = Tile(this.x + x, this.y + y)

    fun getDistance(other: Tile): Int = abs(this.x - other.x) + abs(this.y - other.y)

    fun getSquareDistance(other: Tile): Int {
        val dx = this.x - other.x
        val dy = this.y - other.y
        return ceil(sqrt((dx * dx + dy * dy).toDouble())).toInt()
    }

    fun isWithinRadius(x: Int, y: Int, plane: Int, radius: Int): Boolean {
        if(this.plane != plane) {
            return false
        }

        val dx = abs(this.x - x)
        val dy = abs(this.y - y)
        return dx <= radius && dy <= radius
    }

    companion object {
        /**
         * The server position unit length and width of a Tile.
         */
        const val SIZE = 1
    }
}