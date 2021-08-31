package dev.avernic.server.engine.net.game

import dev.avernic.server.engine.net.packet.client.UnknownPacket
import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import org.tinylog.kotlin.Logger

class PacketDecoder(private val protocol: GameProtocol) {

    private enum class Stage {
        OPCODE,
        LENGTH,
        PAYLOAD
    }

    private var stage = Stage.OPCODE
    private var opcode = -1
    private var type: PacketType = PacketType.FIXED
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
            Logger.error(e) { "An error occurred while decoding client packet with opcode: $opcode." }
            buf.skipBytes(buf.readableBytes())
            protocol.session.disconnect()
            return
        }
    }

    private fun ByteBuf.readOpcode(out: MutableList<Any>) {
        if(isReadable) {
            opcode = (readUnsignedByte().toInt() - protocol.session.decoderIsaac.nextInt()) and 0xFF
            length = GamePackets.CLIENT_LENGTHS[opcode]!!
            ignore = GamePackets.CLIENT.isUnknown(opcode)

            when(length) {
                -1, -2 -> stage = Stage.LENGTH
                else -> {
                    if(length != 0) {
                        stage = Stage.PAYLOAD
                    } else if(!ignore) {
                        val codec = GamePackets.CLIENT.getCodec(opcode)
                        val packet = codec.decode(protocol.session, Unpooled.EMPTY_BUFFER)
                        out.add(packet)
                    }
                }
            }
        }
    }

    private fun ByteBuf.readLength(out: MutableList<Any>) {
        if(isReadable) {
            length = if(type == PacketType.VARIABLE_SHORT) readUnsignedShort() else readUnsignedByte().toInt()
            if(length != 0) {
                stage = Stage.PAYLOAD
            } else if(!ignore) {
                val codec = GamePackets.CLIENT.getCodec(opcode)
                val packet = codec.decode(protocol.session, Unpooled.EMPTY_BUFFER)
                out.add(packet)
            }
        }
    }

    private fun ByteBuf.readPayload(out: MutableList<Any>) {
        if(readableBytes() >= length) {
            val payload = readBytes(length)
            reset()

            if(!ignore) {
                val codec = GamePackets.CLIENT.getCodec(opcode)
                val packet = codec.decode(protocol.session, payload)
                out.add(packet)
            }
        }
    }

    private fun reset() {
        stage = Stage.OPCODE
    }
}