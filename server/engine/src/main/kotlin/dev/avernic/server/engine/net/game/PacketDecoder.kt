package dev.avernic.server.engine.net.game

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
    private var opcode = 0
    private var type = PacketType.FIXED
    private var length = 0

    fun decode(buf: ByteBuf, out: MutableList<Any>) {
        when(stage) {
            Stage.OPCODE -> decodeOpcode(buf)
            Stage.LENGTH -> decodeLength(buf)
            Stage.PAYLOAD -> decodePayload(buf, out)
        }
    }

    private fun decodeOpcode(buf: ByteBuf) {
        opcode = (buf.readUnsignedByte().toInt() - protocol.session.decoderIsaac.nextInt()) and 0xFF

        if(GamePackets.CLIENT.isUnknown(opcode)) {
            Logger.warn("Received unknown client packet with opcode: $opcode.")
            this.skipPacket(buf)
            return
        } else {
            stage = Stage.LENGTH
        }
    }

    private fun decodeLength(buf: ByteBuf) {
        type = PacketType.fromLength(GamePackets.CLIENT_LENGTHS[opcode]!!)

        length = when(type) {
            PacketType.VARIABLE_BYTE -> buf.readUnsignedByte().toInt()
            PacketType.VARIABLE_SHORT -> buf.readUnsignedShort()
            else -> GamePackets.CLIENT_LENGTHS[opcode]!!
        }

        stage = Stage.PAYLOAD
    }

    private fun decodePayload(buf: ByteBuf, out: MutableList<Any>) {
        if(!buf.isReadable(length)) {
            buf.skipBytes(buf.readableBytes())
        } else {
            val payload = if(length > 0) buf.readBytes(length) else Unpooled.EMPTY_BUFFER
            val codec = GamePackets.CLIENT.getCodec(opcode)
            val packet = try {
                codec.decode(protocol.session, payload)
            } finally {
                payload.release()
            }

            out.add(packet)
            stage = Stage.OPCODE
        }
    }

    private fun skipPacket(buf: ByteBuf) {
        try {
            val packetLength = GamePackets.CLIENT_LENGTHS[opcode]
                ?: throw IllegalStateException("Received invalid opcode: $opcode.")

            val type = PacketType.fromLength(packetLength)

            length = when(type) {
                PacketType.VARIABLE_BYTE -> buf.readUnsignedByte().toInt()
                PacketType.VARIABLE_SHORT -> buf.readUnsignedShort()
                else -> packetLength
            }

            if(length > 0) {
                buf.skipBytes(length)
            }
        } catch(e : Exception) {
            Logger.error(e) { "Failed to skip an inbound client packet. [opcode: $opcode, type: $type, length: $length]." }
            protocol.session.disconnect()
        }

        stage = Stage.OPCODE
    }
}