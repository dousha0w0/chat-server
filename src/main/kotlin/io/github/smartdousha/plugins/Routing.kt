package io.github.smartdousha.plugins

import io.github.smartdousha.room.RoomController
import io.github.smartdousha.routes.chatSocket
import io.github.smartdousha.routes.getAllMessages
import io.ktor.application.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing){
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
