package com.tcs.integration.common.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

@Component
class ConfigProperties() {

    @Value("\${cm.int.kafka.server-url}")
    lateinit var serverUrl: String

    @Value("\${cm.messaging.topic}")
    lateinit var topic: String
}