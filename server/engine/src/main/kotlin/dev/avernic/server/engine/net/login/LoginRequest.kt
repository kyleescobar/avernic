package dev.avernic.server.engine.net.login

import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.Session

data class LoginRequest(
    val session: Session,
    val loginType: LoginType,
    val clientType: Int,
    val xteas: IntArray,
    val reconnectXteas: IntArray?,
    val seed: Long,
    val authCode: Int?,
    val password: String?,
    val username: String,
    val resizableMode: Boolean,
    val clientWidth: Int,
    val clientHeight: Int
) : Message {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LoginRequest

        if (session != other.session) return false
        if (loginType != other.loginType) return false
        if (clientType != other.clientType) return false
        if (!xteas.contentEquals(other.xteas)) return false
        if (reconnectXteas != null) {
            if (other.reconnectXteas == null) return false
            if (!reconnectXteas.contentEquals(other.reconnectXteas)) return false
        } else if (other.reconnectXteas != null) return false
        if (seed != other.seed) return false
        if (authCode != other.authCode) return false
        if (password != other.password) return false
        if (username != other.username) return false
        if (resizableMode != other.resizableMode) return false
        if (clientWidth != other.clientWidth) return false
        if (clientHeight != other.clientHeight) return false

        return true
    }

    override fun hashCode(): Int {
        var result = session.hashCode()
        result = 31 * result + loginType.hashCode()
        result = 31 * result + clientType
        result = 31 * result + xteas.contentHashCode()
        result = 31 * result + (reconnectXteas?.contentHashCode() ?: 0)
        result = 31 * result + seed.hashCode()
        result = 31 * result + (authCode ?: 0)
        result = 31 * result + (password?.hashCode() ?: 0)
        result = 31 * result + username.hashCode()
        result = 31 * result + resizableMode.hashCode()
        result = 31 * result + clientWidth
        result = 31 * result + clientHeight
        return result
    }
}