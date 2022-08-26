package com.example.demokafkaproducer.kafka.listeners

import com.example.demokafkaproducer.kafka.producer.SingProducer
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.beans.factory.annotation.Autowired
import ru.tinkoff.sme.cryptobpm.requests.SignRequestV2


/**
 * @author e.dukhnay
 */
abstract class AbstractEventListener<T> : EventListener<T> {
//    @Autowired
//    lateinit var eventParser: EventParser<T>

    @Autowired
    lateinit var producer: SingProducer

//    @Autowired
//    lateinit var eventHandler: EventHandler<T>

//    @Autowired(required = false)
//    var eventValidator: EventValidator<T>? = null

    override fun onMessage(message: ConsumerRecord<*, T>) {
//        try {
//            eventParser.parse(message).let { event ->
//                if (eventValidator?.isValid(event) == false) {
//                    error("Invalid event, skip. Event: $event")
//                }
        producer.produceMessage(message.key() as String, message.value() as SignRequestV2)
//            }
//        } catch (e: Exception) {
//            throw e
//        }
    }
//"{"requestId": "f735d91a-c4cf-47c5-a5fd-a11c925719ef", "signer": {"innFl": "387053354809", "snils": "96555411947"},
// "system": "pledge-mortgage-process", "withoutConfirmation": true, "selectStrategy": "OLDEST_FIRST",
// "rosreestrCompatible": false, "useMyDssSdk": false, "signatureType": "BES_DETACHED",
// "files": [{"fileId": "94812576-3-35XX5QKXL", "uri": "s3://pledge-mortgage-dev/signatures/20220822144043452PMP2fc7e7bef2",
// "signatureUri": null, "meta": {"fileName": "app_mortg_35845_6e3dc0c4-ece7-4b0f-af4f-2ab3f7b979e5.xml"}},
// {"fileId": "94812590-3-35XX5QKXL", "uri": "s3://pledge-mortgage-dev/signatures/20220822144043452PMP2fc7e7bef2",
// "signatureUri": null, "meta": {"fileName": "request.xml"}}]}"


//    private fun dump(message: ConsumerRecord<*, *>): String {
//        return "ConsumerRecord: ${message.topic()} offset: ${message.offset()} " +
//            "headers: ${dumpHeaders(message.headers())} value: ${message.value()}"
//    }
//
//    private fun dumpHeaders(headers: Headers?): String {
//        var message: String = "["
//        headers?.forEach { header -> message += header.key() + ": " + String(header.value()) }
//        message += "]"
//        return message
//    }
}