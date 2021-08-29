package dev.avernic.server.engine.game

data class Appearance(var styles: IntArray, var colors: IntArray, var gender: Gender) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Appearance

        if (!styles.contentEquals(other.styles)) return false
        if (!colors.contentEquals(other.colors)) return false
        if (gender != other.gender) return false

        return true
    }

    override fun hashCode(): Int {
        var result = styles.contentHashCode()
        result = 31 * result + colors.contentHashCode()
        result = 31 * result + gender.hashCode()
        return result
    }

    companion object {
        private val DEFAULT_STYLES = intArrayOf(0, 10, 18, 26, 33, 36, 42)
        private val DEFAULT_COLORS = intArrayOf(0, 0, 0, 0, 0)
    }
}