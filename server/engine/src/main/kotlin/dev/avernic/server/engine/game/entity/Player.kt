package dev.avernic.server.engine.game.entity

import dev.avernic.server.config.ServerConfig
import dev.avernic.server.engine.event.EventBus
import dev.avernic.server.engine.event.player.PlayerLoginEvent
import dev.avernic.server.engine.event.player.PlayerLogoutEvent
import dev.avernic.server.engine.event.player.PlayerMoveEvent
import dev.avernic.server.engine.event.schedule
import dev.avernic.server.engine.game.Appearance
import dev.avernic.server.engine.game.MovementType
import dev.avernic.server.engine.game.Privilege
import dev.avernic.server.engine.game.entity.pathfinder.PlayerPathfinder
import dev.avernic.server.engine.game.entity.update.PlayerUpdateFlag
import dev.avernic.server.engine.game.interf.DisplayMode
import dev.avernic.server.engine.game.manager.GpiManager
import dev.avernic.server.engine.game.manager.InterfaceManager
import dev.avernic.server.engine.game.manager.SceneManager
import dev.avernic.server.engine.game.map.Tile
import dev.avernic.server.engine.net.StatusResponse
import dev.avernic.server.engine.net.game.GameProtocol
import dev.avernic.server.engine.net.login.LoginRequest
import dev.avernic.server.engine.net.login.LoginResponse
import dev.avernic.server.util.SHA256
import org.tinylog.kotlin.Logger

class Player(val client: Client) : LivingEntity() {

    var username: String = ""
    var passwordHash: String = ""
    var displayName: String = ""
    var privilege: Privilege = Privilege.ADMINISTRATOR
    var appearance: Appearance = Appearance.DEFAULT
    var pid: Int = -1
    var member: Boolean = true
    var displayMode: DisplayMode = DisplayMode.FIXED
    var skullIcon: Int = -1
    var prayerIcon: Int = -1
    override var combatLevel: Int = 3

    /**
     * The pathfinder configured for players.
     */
    override val pathfinder = PlayerPathfinder(this)

    override var running: Boolean = super.running
        set(value) {
            field = value
            addMovementModeUpdateFlag()
        }

    /*
     * Player context managers.
     */
    val gpi = GpiManager(this)
    val scene = SceneManager(this)
    val interfaces = InterfaceManager(this)

    override val updateFlags = sortedSetOf<PlayerUpdateFlag>()

    private fun initialize() {
        gpi.initialize()
        scene.initialize()
        interfaces.initialize()
    }

    internal fun login(request: LoginRequest) {
        username = request.username
        displayName = request.username

        if(request.password != null) {
            passwordHash = SHA256.hash(request.password)
        }

        client.resizableMode = request.resizableMode
        client.width = request.clientWidth
        client.height = request.clientHeight

        /*
         * Set the player tile to the default home tile.
         */
        tile = Tile(ServerConfig.DEFAULTS.HOME_TILE.X, ServerConfig.DEFAULTS.HOME_TILE.Y, ServerConfig.DEFAULTS.HOME_TILE.PLANE)
        prevTile = tile
        prevPathTile = tile.copy()

        /*
         * Register the player with the game world.
         */
        world.players.add(this)

        /*
         * Update the Session State values and Isaac Random values.
         */
        client.session.client = client
        client.session.seed = request.seed
        client.session.xteas = request.xteas
        client.session.reconnectXteas = request.reconnectXteas

        client.session.encoderIsaac.init(IntArray(4) { request.xteas[it] + 50 })
        client.session.decoderIsaac.init(request.xteas)

        val response = LoginResponse(StatusResponse.NORMAL, this)
        client.session.writeAndFlush(response).addListener {
            if(it.isSuccess) {
                client.session.protocol.set(GameProtocol(client.session))
                this.initialize()
            }
        }

        EventBus.schedule(PlayerLoginEvent(this))

        Logger.info("[username: $username] has connected to the server.")
    }

    internal fun logout() {
        world.players.remove(this)

        EventBus.schedule(PlayerLogoutEvent(this))

        Logger.info("[username: $username] has disconnected from the server.")
    }

    internal fun synchronize() {
        scene.synchronize()
        gpi.synchronize()
        client.flush()
    }

    override fun scheduleMoveEvent(type: MovementType) = EventBus.schedule(PlayerMoveEvent(this, type))

    override fun addAppearanceUpdateFlag() { updateFlags.add(PlayerUpdateFlag.APPEARANCE) }
    override fun addForceChatUpdateFlag() { updateFlags.add(PlayerUpdateFlag.FORCE_CHAT) }
    override fun addMovementUpdateFlag() { updateFlags.add(PlayerUpdateFlag.MOVEMENT) }
    override fun addMovementModeUpdateFlag() { updateFlags.add(PlayerUpdateFlag.MOVEMENT_MODE) }
}