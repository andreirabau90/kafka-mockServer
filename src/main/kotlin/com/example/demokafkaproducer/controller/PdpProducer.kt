package com.example.demokafkaproducer.controller

import org.apache.kafka.clients.producer.ProducerRecord
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.tinkoff.bpm.pledge.mortgage.StartEvent

@RestController
class PdpProducer(
    var startEventKafkaTemplate: KafkaTemplate<String, StartEvent>
) {
    @GetMapping("/pmp")
    fun produceMessage(){
        val startEvent = StartEvent(
            "AUTO20210903171112VSQ273171",
            "20220726112819626PLES119825761",
            "AUTO20210903171112VSQ294401_61",
            154389
        )
        startEventKafkaTemplate.send(ProducerRecord("bpm.pledge-mortgage.create", null, startEvent))
    }
}
