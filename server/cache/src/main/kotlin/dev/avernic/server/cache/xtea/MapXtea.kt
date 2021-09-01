package dev.avernic.server.cache.xtea

data class MapXtea(val id: Int, val key: IntArray) {
    val x: Int get() = id shr 8

    val y: Int get() = id and 0xFF

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as MapXtea
        if (id != other.id) return false
        if (!key.contentEquals(other.key)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + key.contentHashCode()
        return result
    }
}