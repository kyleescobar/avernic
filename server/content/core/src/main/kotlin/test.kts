import dev.avernic.server.engine.event.on_event
import dev.avernic.server.engine.event.world.ServerStartEvent
import dev.avernic.server.engine.game.map.Tile

on_event<ServerStartEvent> {

    world.spawnNpc(70, Tile(3235, 3218, 0))
    world.spawnNpc(70, Tile(3235, 3219, 0))
    world.spawnNpc(70, Tile(3235, 3220, 0))
    world.spawnNpc(70, Tile(3235, 3221, 0))
    world.spawnNpc(70, Tile(3235, 3222, 0))
    world.spawnNpc(70, Tile(3235, 3223, 0))
}