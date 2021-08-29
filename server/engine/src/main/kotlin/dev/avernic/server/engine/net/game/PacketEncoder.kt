package dev.avernic.server.engine.net.game

import io.netty.buffer.ByteBuf
import org.tinylog.kotlin.Logger

class PacketEncoder(private val protocol: GameProtocol) {

    fun encode(packet: Packet, out: ByteBuf) {
        val opcode = GamePackets.SERVER.getOpcode(packet::class)
        val type = GamePackets.SERVER.getPacketType(opcode)
        val codec = GamePackets.SERVER.getCodec(opcode)

        val buf = protocol.session.ctx.alloc().buffer()

        /*
         * Write the data to the buffer using the
         * packet codec.
         */
        codec.encode(protocol.session, packet, buf)

        val length = buf.writerIndex()

        if(type == PacketType.VARIABLE_BYTE && length >= 256) {
            Logger.error("Game packet length $length is too large for packet type 'variable-byte'.")
            return
        }

        if(type == PacketType.VARIABLE_SHORT && length >= 65536) {
            Logger.error("Game packet length $length is too large for packet type 'variable-short'.")
            return
        }

        /*
         * Write the packet's opcode with the Isaac random transform applied.
         */
        out.writeByte((opcode + (protocol.session.encoderIsaac.nextInt())) and 0xFF)

        /*
         * If the packet's type is a variable length packet,
         * we write the length of payload.
         */
        when(type) {
            PacketType.VARIABLE_BYTE -> out.writeByte(length)
            PacketType.VARIABLE_SHORT -> out.writeShort(length)
            else -> { /* Nothing to do */ }
        }

        /*
         * Write the game packet's payload data.
         */
        out.writeBytes(buf)

        /*
         * Release the payload's buffer for garbage collection.
         */
        buf.release()
    }
}