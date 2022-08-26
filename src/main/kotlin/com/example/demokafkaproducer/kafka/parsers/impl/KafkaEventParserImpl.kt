package com.example.demokafkaproducer.kafka.parsers.impl

import org.apache.avro.specific.SpecificRecordBase
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.stereotype.Component
import ru.tinkoff.bpm.pledge.mortgage.process.event.parsers.EventParser
import ru.tinkoff.sme.cryptobpm.requests.SignRequestV2


/**
 * @author e.dukhnay
 */
@Component
class KafkaEventParserImpl<T : SpecificRecordBase?> : EventParser<T> {

    @Suppress("UNCHECKED_CAST")
    override fun parse(message: ConsumerRecord<*, T>): T {
        val result = message.value() as T
        if (result == null) {
            println( "Got unacceptable message: ${message.value()}" )
        }
        return result
    }

}
