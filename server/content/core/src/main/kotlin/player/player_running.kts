import api.drainRunEnergy
import api.recoverRunEnergy
import api.toggleRun
import dev.avernic.server.engine.event.on_event
import dev.avernic.server.engine.event.player.PlayerCycleEvent
import dev.avernic.server.engine.event.player.PlayerMoveEvent
import dev.avernic.server.engine.game.MovementType

on_event<PlayerMoveEvent>()
    .where { type == MovementType.RUN }
    .then {
        if(player.runEnergy <= 0) {
            player.toggleRun()
            return@then
        }
        player.drainRunEnergy()
    }

on_event<PlayerCycleEvent>()
    .where { !player.running && player.runEnergy <= 100 }
    .then {
        player.recoverRunEnergy()
    }