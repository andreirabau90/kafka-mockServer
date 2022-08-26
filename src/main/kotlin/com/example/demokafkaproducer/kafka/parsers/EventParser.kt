package ru.tinkoff.bpm.pledge.mortgage.process.event.parsers

import org.apache.kafka.clients.consumer.ConsumerRecord
import ru.tinkoff.sme.cryptobpm.requests.SignRequestV2

/**
 * @author e.dukhnay
 */
interface EventParser<T> {
    fun parse(message: ConsumerRecord<*, T>): T
}
