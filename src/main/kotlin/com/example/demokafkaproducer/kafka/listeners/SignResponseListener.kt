package com.example.demokafkaproducer.kafka.listeners

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.header.Header
import org.apache.kafka.common.header.internals.RecordHeader
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component
import ru.tinkoff.sme.cryptobpm.requests.SignRequestV2
import ru.tinkoff.sme.cryptobpm.responses.FileRef
import ru.tinkoff.sme.cryptobpm.responses.SignResponseV2
import java.util.*

/**
 * @author e.dukhnay
 */
@Component
class SignResponseListener(
    var pmpKafkaProducerTemplate: KafkaTemplate<String, SignResponseV2>
) {
    @KafkaListener(
        id = "bpm.pledge-mortgage-signed-dev",
        groupId = "{bpm.pledge-mortgage.consumer}",
        topics = ["sme.cement.in","sme.cement.out"],
        containerFactory = "kafkaListenerContainerFactory",
    )
    fun onMessage(message: ConsumerRecord<*, *>) {
        when (message.value()){
         is SignRequestV2 -> produceMessagePmp(message.key() as String, message.value() as SignRequestV2
         )
        }

    }

    fun produceMessagePmp(key: String, data: SignRequestV2) {
        val signResponseV2 = SignResponseV2(
            data.getRequestId(),
            data.getSystem(),
            true,
            null,
            listOf(
                FileRef(
                    data.getFiles()[0].getFileId(),
                    data.getFiles()[0].getUri())
            )
        )
        val headers: List<Header> = listOf(RecordHeader("businessKey", key.toByteArray()))

        println(signResponseV2)
        pmpKafkaProducerTemplate.send(
            ProducerRecord(
                "sme.cement.out",
                null,
                key,
                signResponseV2,
                headers)
        )
    }
}
