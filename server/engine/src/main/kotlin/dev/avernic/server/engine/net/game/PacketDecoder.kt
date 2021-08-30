package dev.avernic.server.engine.net.game

import io.netty.buffer.ByteBuf
import org.tinylog.kotlin.Logger

class PacketDecoder(private val protocol: GameProtocol) {

    private enum class Stage {
        OPCODE,
        LENGTH,
        PAYLOAD
    }

    private var stage = Stage.OPCODE
    private var opcode = -1
    private var length = 0
    private var ignore = false

    fun decode(buf: ByteBuf, out: MutableList<Any>) {
        try {
            when(stage) {
                Stage.OPCODE -> buf.readOpcode(out)
                Stage.LENGTH -> buf.readLength(out)
                Stage.PAYLOAD -> buf.readPayload(out)
            }
        } catch(e : Exception) {
            Logger.error(e) { "An error occurred while decoding inbound client packet opcode: $opcode." }
            buf.skipBytes(buf.readableBytes())
            protocol.session.disconnect()
            return
        }
    }

    private fun ByteBuf.readOpcode(out: MutableList<Any>) {
        opcode = (readUnsignedByte().toInt() - protocol.session.decoderIsaac.nextInt()) and 0xFF
        length = GamePackets.CLIENT_LENGTHS[opcode]!!

        if(GamePackets.CLIENT.isUnknown(opcode)) {
            Logger.warn("Received unknown client packet with opcode: $opcode.")
            ignore = true
        }

        if(length == 0) {
            readPayload(out)
            return
        }

        stage = if(length < 0) Stage.LENGTH else Stage.PAYLOAD
    }

    private fun ByteBuf.readLength(out: MutableList<Any>) {
       length = readLengthBytes() ?: return

        if(length == 0) {
            readPayload(out)
        } else {
            stage = Stage.PAYLOAD
        }
    }

    private fun ByteBuf.readPayload(out: MutableList<Any>) {
        if(readableBytes() < length) {
            return
        }
        try {
            if(ignore) {
                skipBytes(length)
            } else {
                val payload = readBytes(length)
                val codec = GamePackets.CLIENT.getCodec(opcode)
                val packet = codec.decode(protocol.session, payload)
                out.add(packet)
            }
        } finally {
            stage = Stage.OPCODE
            opcode = -1
            length = 0
            ignore = false
        }
    }

    private fun ByteBuf.readLengthBytes(): Int? = when(length) {
        -1 -> if(readableBytes() < Byte.SIZE_BYTES) null else readUnsignedByte().toInt()
        -2 -> if(readableBytes() < Short.SIZE_BYTES) null else readUnsignedShort()
        else -> throw IllegalStateException("Unsupported packet length: $length.")
    }
}