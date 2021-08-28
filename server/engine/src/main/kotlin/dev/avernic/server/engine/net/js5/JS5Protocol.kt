package dev.avernic.server.engine.net.js5

import dev.avernic.server.cache.GameCache
import dev.avernic.server.common.inject
import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.Protocol
import dev.avernic.server.engine.net.Session
import io.netty.buffer.ByteBuf

class JS5Protocol(session: Session) : Protocol(session) {

    private val gameCache: GameCache by inject()

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        buf.markReaderIndex()

        when(JS5RequestType.fromOpcode(buf.readByte().toInt())) {
            JS5RequestType.GAME_INIT,
            JS5RequestType.GAME_LOADED,
            JS5RequestType.GAME_READY -> {
                buf.skipBytes(3)
            }

            JS5RequestType.REQUEST_NORMAL,
            JS5RequestType.REQUEST_PRIORITY -> {
                if(buf.readableBytes() < 3) {
                    buf.resetReaderIndex()
                } else {
                    val archive = buf.readUnsignedByte().toInt()
                    val group = buf.readUnsignedShort()
                    val request = JS5Request(archive, group)
                    out.add(request)
                }
            }
        }
    }

    override fun encode(message: Message, out: ByteBuf) {
        if(message !is JS5Response) return

        out.writeByte(message.archive)
        out.writeShort(message.group)
        out.writeByte(message.compressionType)
        out.writeInt(message.compressedLength)

        message.data.forEach { byte ->
            if(out.writerIndex() % 512 == 0) {
                out.writeByte(-1)
            }
            out.writeByte(byte.toInt())
        }
    }

    override fun handle(message: Message) {
        if(message !is JS5Request) return

        val data = gameCache.store.read(message.archive, message.group).retain()
        val compressionType = data.readUnsignedByte().toInt()
        val compressedLength = data.readInt()

        val bytes = ByteArray(data.writerIndex() - Byte.SIZE_BYTES - Int.SIZE_BYTES)
        data.readBytes(bytes)

        val response = JS5Response(message.archive, message.group, compressionType, compressedLength, bytes)
        session.writeAndFlush(response)
    }

}