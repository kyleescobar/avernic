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

    val as30BitInteger: Int get() = (y and 0x3FFF) or ((x and 0x3FFF) shl 14) or ((plane and 0x3) shl 28)

    val as18BitInteger: Int get() = (y shr 13) or ((x shr 13) shl 8) or ((plane and 0x3) shl 16)

    val regionId: Int get() = (x shr 6) shl 8 or (y shr 6)

    val chunkX: Int get() = x shr 3
    val chunkY: Int get() = x shr 3


    fun transform(x: Int = 0, y: Int = 0, plane: Int = 0) = Tile(this.x + x, this.y + y)

    fun getDistance(other: Tile): Int = abs(this.x - other.x) + abs(this.y - other.y)

    fun getSquareDistance(other: Tile): Int {
        val dx = this.x - other.x
        val dy = this.y - other.y
        return ceil(sqrt((dx * dx + dy * dy).toDouble())).toInt()
    }

    fun isWithinRadius(other: Tile, radius: Int): Boolean = isWithinRadius(other.x, other.y, other.plane, radius)

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