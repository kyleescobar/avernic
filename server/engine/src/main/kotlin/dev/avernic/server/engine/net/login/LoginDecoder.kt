package dev.avernic.server.engine.net.login

import dev.avernic.server.common.inject
import dev.avernic.server.config.ServerConfig
import dev.avernic.server.engine.net.Session
import dev.avernic.server.engine.net.StatusResponse
import dev.avernic.server.util.RSA
import dev.avernic.server.util.Xtea
import io.guthix.buffer.readString0CP1252
import io.guthix.buffer.readStringCP1252
import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import java.math.BigInteger

class LoginDecoder(private val session: Session) {

    private val rsa: RSA by inject()

    private var stage = Stage.HANDSHAKE
    private var retries = 0
    private var payloadLength = 0

    private lateinit var loginType: LoginType

    fun decode(buf: ByteBuf, out: MutableList<Any>) {
        try {
            when(stage) {
                Stage.HANDSHAKE -> decodeHandshake(buf, out)
                Stage.HEADER -> decodeHeader(buf, out)
                Stage.PAYLOAD -> decodePayload(buf, out)
            }
        } catch(e : LoginError) {
            session.writeAndClose(e.status)
            return
        }
    }

    private fun decodeHandshake(buf: ByteBuf, out: MutableList<Any>) {
        loginType = LoginType.fromOpcode(buf.readUnsignedByte().toInt())

        /*
         * Check if login type is a reconnection.
         */

        stage = Stage.HEADER
    }

    private fun decodeHeader(buf: ByteBuf, out: MutableList<Any>) {
        if(buf.readableBytes() < Short.SIZE_BYTES) {
            retry()
            return
        }

        payloadLength = buf.readUnsignedShort()

        if(payloadLength == 0) {
            throw LoginError(StatusResponse.COULD_NOT_COMPLETE_LOGIN)
        }

        retries = 0
        stage = Stage.PAYLOAD
    }

    private fun decodePayload(buf: ByteBuf, out: MutableList<Any>) {
        if(buf.readableBytes() < payloadLength) {
            retry()
            return
        }

        val clientRevision = buf.readInt()
        if(clientRevision != ServerConfig.REVISION) {
            throw LoginError(StatusResponse.OUT_OF_DATE)
        }

        buf.skipBytes(Int.SIZE_BYTES)
        val clientType = buf.readUnsignedByte().toInt()
        buf.skipBytes(Byte.SIZE_BYTES)

        val rsaBuf = run {
            val length = buf.readUnsignedShort()
            buf.decryptRSA(rsa.privateExponent, rsa.privateModulus, length)
        }

        val payload = ByteArray(buf.readableBytes())
        buf.readBytes(payload)

        /*
         * ======== RSA BUFFER DECODE =========
         */

        val decryptCheck = rsaBuf.readByte().toInt()
        if(decryptCheck != 1) {
            throw LoginError(StatusResponse.COULD_NOT_COMPLETE_LOGIN)
        }

        val xteas = IntArray(4) { rsaBuf.readInt() }
        val seed = rsaBuf.readLong()

        if(seed != session.seed) {
            throw LoginError(StatusResponse.COULD_NOT_COMPLETE_LOGIN)
        }

        val authCode: Int?
        val password: String?
        var reconnectXteas: IntArray? = null

        if(loginType == LoginType.RECONNECT) {
            reconnectXteas = IntArray(4) { rsaBuf.readInt() }
            authCode = null
            password = null
            throw LoginError(StatusResponse.ACCOUNT_LOCKED)
        } else {
            authCode = when (rsaBuf.readByte().toInt()) {
                2 -> {
                    rsaBuf.skipBytes(Int.SIZE_BYTES)
                    -1
                }

                1, 3 -> {
                    val code = rsaBuf.readUnsignedMedium()
                    rsaBuf.skipBytes(Byte.SIZE_BYTES)
                    code
                }

                else -> rsaBuf.readInt()
            }

            rsaBuf.skipBytes(Byte.SIZE_BYTES)
            password = rsaBuf.readStringCP1252()
        }

        /*
         * ======== XTEA BUFFER DECODE =======
         */

        val xteaBuf = Unpooled.wrappedBuffer(Xtea.decipher(payload, xteas))

        val username = xteaBuf.readStringCP1252()
        if(username.isBlank()
            || Regex("[^a-zA-Z0-9\\d ]").containsMatchIn(username)
        ) {
            throw LoginError(StatusResponse.INVALID_CREDENTIALS)
        }

        val flags = xteaBuf.readByte().toInt()
        val resizableMode = (flags shr 1) == 1
        val clientWidth = xteaBuf.readUnsignedShort()
        val clientHeight = xteaBuf.readUnsignedShort()

        ByteArray(24) { xteaBuf.readByte() }

        xteaBuf.readStringCP1252()
        xteaBuf.readInt()

        /*
         * Platform information
         */
        xteaBuf.skipBytes(Byte.SIZE_BYTES * 18)
        xteaBuf.readString0CP1252()
        xteaBuf.readString0CP1252()
        xteaBuf.readString0CP1252()
        xteaBuf.readString0CP1252()
        xteaBuf.skipBytes(Byte.SIZE_BYTES * 3)
        xteaBuf.readString0CP1252()
        xteaBuf.readString0CP1252()
        xteaBuf.skipBytes(Byte.SIZE_BYTES * 2)
        repeat(3) { xteaBuf.skipBytes(Int.SIZE_BYTES) }
        xteaBuf.skipBytes(Int.SIZE_BYTES)
        xteaBuf.readString0CP1252()
        xteaBuf.skipBytes(Byte.SIZE_BYTES * 5)

        repeat(21) {
            xteaBuf.skipBytes(Int.SIZE_BYTES)
        }

        val request = LoginRequest(
            session,
            loginType,
            clientType,
            xteas,
            reconnectXteas,
            seed,
            authCode,
            password,
            username,
            resizableMode,
            clientWidth,
            clientHeight
        )
        out.add(request)
    }

    private fun retry() {
        retries++
        if(retries >= MAX_RETRIES) {
            throw LoginError(StatusResponse.COULD_NOT_COMPLETE_LOGIN)
        }
    }

    private fun ByteBuf.decryptRSA(exponent: BigInteger, modulus: BigInteger, length: Int): ByteBuf {
        val bytes = ByteArray(length)
        readBytes(bytes)
        return Unpooled.wrappedBuffer(BigInteger(bytes).modPow(exponent, modulus).toByteArray())
    }

    enum class Stage {
        HANDSHAKE,
        HEADER,
        PAYLOAD;
    }

    companion object {

        private const val MAX_RETRIES = 5

    }
}