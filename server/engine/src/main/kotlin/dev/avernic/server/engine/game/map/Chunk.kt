package dev.avernic.server.engine.game.map

class Chunk(private val packed: Int) {

    val x: Int get() = packed and 0x7FFF

    val y: Int get() = (packed shr 15) and 0x7FFF

    val plane: Int get() = (packed shr 30) and 0x3

    constructor(x: Int, y: Int, plane: Int = 0) : this(
        (x and 0x7FFF) or ((y and 0x7FFF) shl 15) or (plane shl 30)
    )

    fun translate(x: Int, y: Int, plane: Int = 0) = Chunk(this.x + x, this.y + y, this.plane + plane)

    fun toTile(): Tile = Tile(
        x * SIZE,
        y * SIZE
    )

    fun toRegion(): Region = Region(
        x / (Region.SIZE / SIZE),
        y / (Region.SIZE / SIZE)
    )

    companion object {
        /**
         * The size (width and height) of a chunk in world tiles.
         */
        const val SIZE: Int = 8
    }
}