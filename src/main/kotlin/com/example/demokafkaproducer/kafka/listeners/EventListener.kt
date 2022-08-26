package com.example.demokafkaproducer.kafka.listeners

import org.apache.kafka.clients.consumer.ConsumerRecord
import ru.tinkoff.sme.cryptobpm.requests.SignRequestV2

/**
 * @author e.dukhnay
 */
interface EventListener<SignRequestV2> {
    fun onMessage(message: ConsumerRecord<*, SignRequestV2>)
}
