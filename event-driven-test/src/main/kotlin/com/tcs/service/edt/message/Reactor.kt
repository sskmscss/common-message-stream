package com.tcs.service.edt.message

import com.tcs.integration.common.messageProvider.MessageListener
import org.springframework.stereotype.Component
import org.json.JSONObject

@Component
class Reactor : MessageListener {
    override fun receive(type: String, payload: Any) {
        println("CallBack to the caller method $type $payload")
        when(type) {
            "kafka" ->  {}
            "um"    ->  {
                val json= JSONObject()
                json.put("type", "um")
                json.put("data", payload)
                RxBus.publish(json)
            }
        }
    }
}