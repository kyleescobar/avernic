package dev.avernic.server.engine.net.js5

import dev.avernic.server.engine.net.Message

data class JS5Response(
    val archive: Int,
    val group: Int,
    val compressionType: Int,
    val compressedLength: Int,
    val data: ByteArray
) : Message {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as JS5Response

        if (archive != other.archive) return false
        if (group != other.group) return false
        if (compressionType != other.compressionType) return false
        if (compressedLength != other.compressedLength) return false
        if (!data.contentEquals(other.data)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = archive
        result = 31 * result + group
        result = 31 * result + compressionType
        result = 31 * result + compressedLength
        result = 31 * result + data.contentHashCode()
        return result
    }
}