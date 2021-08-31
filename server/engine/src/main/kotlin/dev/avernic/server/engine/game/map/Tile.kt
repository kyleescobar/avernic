package dev.avernic.server.engine.game.map

import dev.avernic.server.engine.game.Direction
import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.sqrt

class Tile(private val packed: Int) {

    val x: Int get() = packed and 0x7FFF

    val y: Int get() = (packed shr 15) and 0x7FFF

    val plane: Int get() = (packed shr 30) and 0x3

    val as18BitInteger: Int get() = (y shr 13) or ((x shr 13) shl 8) or ((plane and 0x3) shl 16)

    val as30BitInteger: Int get() = (y and 0x3FFF) or ((x and 0x3FFF) shl 14) or ((plane and 0x3) shl 28)

    constructor(x: Int, y: Int, plane: Int = 0) : this(
        (x and 0x7FFF) or ((y and 0x7FFF) shl 15) or (plane shl 30)
    )

    fun translate(x: Int = 0, y: Int = 0, plane: Int = 0) = Tile(this.x + x, this.y + y, this.plane + plane)

    fun translate(direction: Direction): Tile = translate(direction.stepX, direction.stepY)

    fun isWithinRadius(other: Tile, radius: Int): Boolean = isWithinRadius(other.x, other.y, other.plane, radius)

    fun isWithinRadius(x: Int, y: Int, plane: Int, radius: Int): Boolean {
        if(plane != this.plane) {
            return false
        }

        val dx = abs(x - this.x)
        val dy = abs(y - this.y)
        return dx <= radius && dy <= radius
    }

    fun getDistance(other: Tile): Int {
        val dx = x - other.x
        val dy = y - other.y
        return ceil(sqrt((dx * dx + dy * dy).toDouble())).toInt()
    }

    fun getDelta(other: Tile): Int = abs(x - other.x) + abs(y - other.y)

    fun sameAs(x: Int, y: Int): Boolean = this.x == x && this.y == y

    fun sameAs(other: Tile): Boolean = x == other.x && y == other.y && plane == other.plane

    fun copy(): Tile = Tile(x, y, plane)

    fun toChunk(): Chunk = Chunk(
        x / Chunk.SIZE,
        y / Chunk.SIZE
    )

    fun toRegion(): Region = Region(
        x / Region.SIZE,
        y / Region.SIZE
    )

    companion object {
        /**
         * The server position unit length and width of a Tile.
         */
        const val SIZE = 1
    }
}