package dev.avernic.server.engine.game.entity.update

import dev.avernic.server.engine.game.MovementType
import dev.avernic.server.engine.game.entity.Player
import io.guthix.buffer.*
import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import kotlin.math.max

class PlayerUpdateFlag(
    priority: Int,
    mask: Int,
    val encode: ByteBuf.(Player) -> Unit
) : UpdateFlag(priority, mask) {
    companion object {

        /**
         * Player appearance update flag.
         */
        val APPEARANCE: PlayerUpdateFlag = PlayerUpdateFlag(priority = 2, mask = 0x10) { player ->
            val appBuf = Unpooled.buffer()

            appBuf.writeByte(player.appearance.gender.id)
            appBuf.writeByte(player.skullIcon)
            appBuf.writeByte(player.prayerIcon)

            /*
             * Appearance styles
             */
            val stylesTranslation = arrayOf(-1, -1, -1, -1, 2, -1, 3, 5, 0, 4, 6, 1)
            for(i in 0 until 12) {
                if(stylesTranslation[i] == -1) {
                    appBuf.writeByte(0)
                } else {
                    appBuf.writeShort(0x100 + player.appearance.styles[stylesTranslation[i]])
                }
            }

            /*
             * Appearance colors
             */
            for(i in 0 until 5) {
                val color = max(0, player.appearance.colors[i])
                appBuf.writeByte(color)
            }

            /*
             * Stance Animations
             */
            val animations = intArrayOf(808, 823, 819, 820, 821, 822, 824)
            animations.forEach { animation ->
                appBuf.writeShort(animation)
            }

            appBuf.writeStringCP1252(player.displayName)
            appBuf.writeByte(player.combatLevel)
            appBuf.writeShort(0) // Skill level type
            appBuf.writeByte(0) // Invisible

            val bytes = ByteArray(appBuf.writerIndex())
            appBuf.readBytes(bytes)

            this.writeByteAdd(bytes.size)
            this.writeBytesReversedAdd(bytes)
        }

        /**
         * Player Force Chat update flag.
         */
        val FORCE_CHAT: PlayerUpdateFlag = PlayerUpdateFlag(priority = 3, mask = 0x2) { player ->
            this.writeStringCP1252(player.chatMessage ?: "")
        }

        /**
         * Player movement mode update flag.
         */
        val MOVEMENT_MODE: PlayerUpdateFlag = PlayerUpdateFlag(priority = 8, mask = 0x800) { player ->
            this.writeByte(if(player.running) 2 else 1)
        }

        /**
         * Movement update flag.
         */
        val MOVEMENT: PlayerUpdateFlag = PlayerUpdateFlag(priority = 11, mask = 0x2000) { player ->
            if(player.movementType == MovementType.TELEPORT) {
                writeByte(127)
            } else {
                writeByte(0) // CHECK IF THIS IS CORRECT
            }
        }
    }
}