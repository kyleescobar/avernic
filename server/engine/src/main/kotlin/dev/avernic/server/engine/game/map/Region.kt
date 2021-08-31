package dev.avernic.server.engine.game.map

class Region(val id: Int) {

    val x: Int get() = id shr 8

    val y: Int get() = id and 0xFF

    constructor(x: Int, y: Int) : this(
        (x shl 8) or y
    )

    fun translate(x: Int, y: Int) = Region(this.x + x, this.y + y)

    fun toTile(): Tile = Tile(
        x * SIZE,
        y * SIZE
    )

    fun toChunk(): Chunk = Chunk(
        x * (SIZE / Chunk.SIZE),
        y * (SIZE / Chunk.SIZE)
    )

    companion object {

        /**
         * The square size (width+height) in tiles of a world region.
         */
        const val SIZE = 64
    }
}