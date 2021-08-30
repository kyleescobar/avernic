package dev.avernic.server.engine.game.map

import dev.avernic.server.engine.game.entity.Player

class Chunk(
    val x: Int,
    val y: Int,
    val plane: Int
) {

    val masks = Array(SIZE) { IntArray(SIZE) }

    val players = mutableListOf<Player>()

    companion object {
        /**
         * The size (width and height) of a chunk in world tiles.
         */
        const val SIZE: Int = 8
    }
}