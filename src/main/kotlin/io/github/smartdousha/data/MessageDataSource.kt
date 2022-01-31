package io.github.smartdousha.data

import io.github.smartdousha.data.model.Message

interface MessageDataSource {

    suspend fun getAllMessages(): List<Message>

    suspend fun insertMessage(message: Message)
}