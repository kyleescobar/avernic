package dev.avernic.server.engine.net.game

import io.netty.buffer.ByteBuf
import org.tinylog.kotlin.Logger
import java.net.SocketAddress

class PacketDecoder(private val protocol: GameProtocol) {

    private enum class Stage {
        OPCODE,
        LENGTH,
        PAYLOAD
    }

    private var stage = Stage.OPCODE
    private var opcode: Int = -1
    private var length: Int = 0
    private var unknown: Boolean = false

    fun decode(buf: ByteBuf, out: MutableList<Any>) {
        try {
            when(stage) {
                Stage.OPCODE -> buf.readOpcode(out)
                Stage.LENGTH -> buf.readLength(out)
                Stage.PAYLOAD -> buf.readPayload(out)
            }
        } catch (e : Exception) {
            Logger.error(e) { "An error occurred while decoding client packet with opcode: $opcode." }
            buf.skipBytes(buf.readableBytes())
            protocol.session.disconnect()
            return
        }
    }

    private fun ByteBuf.readOpcode(out: MutableList<Any>) {
        opcode = (this.readUnsignedByte().toInt() - protocol.session.decoderIsaac.nextInt()) and 0xFF
        length = GamePackets.CLIENT_LENGTHS[opcode] ?: throw IllegalStateException("No client packet length found for opcode: $opcode.")
        unknown = GamePackets.CLIENT.isUnknown(opcode)

        stage = when {
            length == 0 -> {
                this.readPayload(out)
                return
            }

            length < 0 -> {
                Stage.LENGTH
            }

            else -> {
                Stage.PAYLOAD
            }
        }
    }

    private fun ByteBuf.readLength(out: MutableList<Any>) {
        length = when(length) {
            -1 -> this.readUnsignedByte().toInt()
            -2 -> this.readUnsignedShort()
            else -> throw IllegalStateException("Illegal variable length of $length for opcode: $opcode.")
        }

        if(length == 0) {
            this.readPayload(out)
        } else {
            stage = Stage.PAYLOAD
        }
    }

    private fun ByteBuf.readPayload(out: MutableList<Any>) {
        if(this.readableBytes() >= length) {
            val payload = this.readBytes(length)
            stage = Stage.OPCODE

            if(!unknown) {
                val codec = GamePackets.CLIENT.getCodec(opcode)
                val packet = codec.decode(protocol.session, payload)
                out.add(packet)
            } else {
                Logger.warn("Received unknown client packet. [opcode: $opcode, length: $length, remaining: ${this.readableBytes()}]")
            }
        }
    }
}