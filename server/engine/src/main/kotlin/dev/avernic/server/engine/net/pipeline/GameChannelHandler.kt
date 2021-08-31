package dev.avernic.server.engine.net.pipeline

import dev.avernic.server.engine.net.Message
import dev.avernic.server.engine.net.Session
import io.netty.channel.ChannelHandler
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelInboundHandlerAdapter
import java.util.concurrent.atomic.AtomicReference

@ChannelHandler.Sharable
class GameChannelHandler : ChannelInboundHandlerAdapter() {

    internal val session = AtomicReference<Session>(null)

    override fun channelActive(ctx: ChannelHandlerContext) {
        val newSession = Session(ctx)
        newSession.onConnect()
        session.set(newSession)
    }

    override fun channelInactive(ctx: ChannelHandlerContext) {
        session.get().onDisconnect()
    }

    override fun channelRead(ctx: ChannelHandlerContext, msg: Any) {
        if(msg !is Message) return
        session.get().onMessage(msg)
    }

    override fun exceptionCaught(ctx: ChannelHandlerContext, cause: Throwable) {
        session.get().onError(cause)
    }
}