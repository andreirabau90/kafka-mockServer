package com.example.demokafkaproducer.kafka.producer

import org.apache.kafka.clients.producer.ProducerRecord
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component
import ru.tinkoff.sme.cryptobpm.requests.SignRequestV2
import ru.tinkoff.sme.cryptobpm.responses.FileRef
import ru.tinkoff.sme.cryptobpm.responses.SignResponseV2

@Component
class SingProducer(
    var pmpKafkaProducerTemplate: KafkaTemplate<String, SignResponseV2>
) {
    fun produceMessage(key: String, data: SignRequestV2) {
        val signResponseV2 = SignResponseV2(
            data.getRequestId(),
            data.getSystem(),
            true,
            null,
            listOf(
                data.getFiles().maxOf { FileRef() }
            )
        )
        pmpKafkaProducerTemplate.send(
            ProducerRecord(
                "sme.cement.out", key, signResponseV2
            )
        )
    }
}