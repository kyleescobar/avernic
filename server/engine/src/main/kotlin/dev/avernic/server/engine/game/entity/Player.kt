package dev.avernic.server.engine.game.entity

import dev.avernic.server.config.ServerConfig
import dev.avernic.server.engine.event.EventBus
import dev.avernic.server.engine.event.player.PlayerLoginEvent
import dev.avernic.server.engine.event.player.PlayerLogoutEvent
import dev.avernic.server.engine.event.player.PlayerCycleEvent
import dev.avernic.server.engine.event.player.PlayerMoveEvent
import dev.avernic.server.engine.event.dispatch
import dev.avernic.server.engine.game.Appearance
import dev.avernic.server.engine.game.MessageType
import dev.avernic.server.engine.game.MovementType
import dev.avernic.server.engine.game.Privilege
import dev.avernic.server.engine.game.entity.pathfinder.PlayerPathfinder
import dev.avernic.server.engine.game.entity.update.PlayerUpdateFlag
import dev.avernic.server.engine.game.interf.DisplayMode
import dev.avernic.server.engine.game.manager.*
import dev.avernic.server.engine.game.map.Tile
import dev.avernic.server.engine.net.StatusResponse
import dev.avernic.server.engine.net.game.GameProtocol
import dev.avernic.server.engine.net.login.LoginRequest
import dev.avernic.server.engine.net.login.LoginResponse
import dev.avernic.server.engine.net.packet.server.RunClientScript
import dev.avernic.server.engine.net.packet.server.SendMessageGame
import dev.avernic.server.engine.net.packet.server.UpdateRunEnergy
import dev.avernic.server.util.SHA256
import org.tinylog.kotlin.Logger

class Player(val client: Client) : LivingEntity() {

    var username: String = ""
    var passwordHash: String = ""
    var displayName: String = ""
    var privilege: Privilege = Privilege.ADMINISTRATOR
    var appearance: Appearance = Appearance.DEFAULT
    var displayMode: DisplayMode = DisplayMode.RESIZABLE_MODERN
    var pid: Int = -1
    var member: Boolean = true
    var skullIcon: Int = -1
    var prayerIcon: Int = -1
    override var combatLevel: Int = 3

    /**
     * The pathfinder configured for players.
     */
    override val pathfinder = PlayerPathfinder(this)

    /**
     * Gets and Sets whether the player is running or not.
     */
    override var running: Boolean = super.running
        set(value) {
            field = value
            addMovementModeUpdateFlag()
        }

    /**
     * The run energy value of the player.
     */
    var runEnergy: Int = 0
        set(value) {
            field = value
            client.write(UpdateRunEnergy(value))
        }

    /**
     * Whether this player can walk through walls and blocked terrain.
     */
    var noclip: Boolean = false

    /*
     * Player context managers.
     */
    val gpi = GpiManager(this)
    val scene = SceneManager(this)
    val interfaces = InterfaceManager(this)
    val npcs = NpcManager(this)
    private val varpManager = VarpManager(this)

    override val updateFlags = sortedSetOf<PlayerUpdateFlag>()

    /**
     * A map of varps by their ID for this player.
     */
    val varps: Map<Int, Int> get() = varpManager.varps.toMap()

    /**
     * Runs a client script with ID for this player.
     *
     * @param id Int
     * @param params Array<out Any>
     */
    fun runClientScript(id: Int, vararg params: Any) {
        client.write(RunClientScript(id, *params))
    }

    /**
     * Updates a varp's bit value for this player.
     *
     * @param id Int
     * @param value Int
     */
    fun updateVarbit(id: Int, value: Int) {
        varpManager.updateVarbit(id, value)
    }

    /**
     * Updates a Varp's value for this player.
     *
     * @param id Int
     * @param value Int
     */
    fun updateVarp(id: Int, value: Int) {
        varpManager.updateVarp(id, value)
    }

    fun sendGameMessage(message: String, type: MessageType = MessageType.GAME) {
        client.write(SendMessageGame(type.id, false, message))
    }

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

        EventBus.dispatch(PlayerLoginEvent(this))

        Logger.info("[username: $username] has connected to the server.")
    }

    internal fun logout() {
        world.players.remove(this)

        EventBus.dispatch(PlayerLogoutEvent(this))

        Logger.info("[username: $username] has disconnected from the server.")
    }

    internal fun synchronize() {
        varpManager.synchronize()
        scene.synchronize()
        gpi.synchronize()
        npcs.synchronize()
        client.flush()
    }

    override fun postProcess() {
        super.postProcess()
        EventBus.dispatch(PlayerCycleEvent(this))
        varpManager.postProcess()
        scene.postProcess()
    }

    override fun scheduleMoveEvent(type: MovementType) = EventBus.dispatch(PlayerMoveEvent(this, type))

    override fun addAppearanceUpdateFlag() { updateFlags.add(PlayerUpdateFlag.APPEARANCE) }
    override fun addForceChatUpdateFlag() { updateFlags.add(PlayerUpdateFlag.FORCE_CHAT) }
    override fun addMovementUpdateFlag() { updateFlags.add(PlayerUpdateFlag.MOVEMENT) }
    override fun addMovementModeUpdateFlag() { updateFlags.add(PlayerUpdateFlag.MOVEMENT_MODE) }
}