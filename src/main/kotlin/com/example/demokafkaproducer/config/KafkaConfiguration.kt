package com.example.demokafkaproducer.config

import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG
import io.confluent.kafka.serializers.KafkaAvroDeserializer
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.common.serialization.StringDeserializer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.kafka.KafkaProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory
import org.springframework.kafka.core.*
import ru.tinkoff.bpm.pledge.mortgage.StartEvent
import ru.tinkoff.sme.cryptobpm.requests.SignRequestV2
import ru.tinkoff.sme.cryptobpm.responses.SignResponseV2


@Configuration
class KafkaConfiguration {

    @Autowired
    lateinit var kafkaProperties: KafkaProperties

//    @Bean
//    fun submissionStatusKafkaTemplate() = KafkaTemplate(createProducerFactory<SubmissionStatus>())

    @Bean
    fun startEventKafkaTemplate() = KafkaTemplate(createProducerFactory<StartEvent>())
//
//    @Bean
//    fun updateSubmissionEventKafkaTemplate() = KafkaTemplate(createProducerFactory<UpdateSubmissionEvent>())
//    @Bean
//    fun createSubmissionEventKafkaTemplate() = KafkaTemplate(createProducerFactory<CreateSubmissionEvent>())
//
//    @Bean
//    fun documentSignResponseKafkaTemplate() = KafkaTemplate(createProducerFactory<DocumentSignResponse>())
//    @Bean
//    fun mortgageRefinanceBankSigningEventKafkaTemplate() = KafkaTemplate(createProducerFactory<MortgageRefinanceBankSigningEvent>())

//    @Bean
//    fun pmpKafkaListenerTemplate() = KafkaTemplate(createProducerFactory<SignRequestV2>())

    @Bean
    fun kafkaListenerContainerFactory(
        consumerFactory: ConsumerFactory<Any, ConsumerRecord<*, *>>
    ) = ConcurrentKafkaListenerContainerFactory<Any, ConsumerRecord<*, *>>().also {
        it.consumerFactory = consumerFactory
    }

    @Bean
    fun pmpSingProducerKafkaTemplate() = KafkaTemplate(createProducerFactory<SignResponseV2>())

    private fun <T> createProducerFactory(): ProducerFactory<String, T> {
        val configProps = HashMap<String, Any?>()

        configProps[ProducerConfig.BOOTSTRAP_SERVERS_CONFIG] = kafkaProperties.bootstrapServers
//        configProps[ProducerConfig.ACKS_CONFIG] = kafkaProperties.producer.acks
        configProps[SCHEMA_REGISTRY_URL_CONFIG] = kafkaProperties.properties[SCHEMA_REGISTRY_URL_CONFIG]
//        configProps[CommonClientConfigs.SECURITY_PROTOCOL_CONFIG] =
//            kafkaProperties.properties[CommonClientConfigs.SECURITY_PROTOCOL_CONFIG]
//        configProps[SASL_MECHANISM] = kafkaProperties.properties[SASL_MECHANISM]
//        configProps[SASL_JAAS_CONFIG] = kafkaProperties.properties[SASL_JAAS_CONFIG]
        configProps[ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG] = kafkaProperties.producer.keySerializer
        configProps[ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG] = kafkaProperties.producer.valueSerializer

        return DefaultKafkaProducerFactory(configProps)
    }

    @Bean
    fun consumerFactory(): ConsumerFactory<*, *> {
        val configProps = HashMap<String, Any>()
        configProps[ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG]= kafkaProperties.bootstrapServers
        configProps[ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG]= StringDeserializer::class.java
        configProps[ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG]= KafkaAvroDeserializer::class.java
        configProps[SCHEMA_REGISTRY_URL_CONFIG] = kafkaProperties.properties[SCHEMA_REGISTRY_URL_CONFIG]!!
        configProps[KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG]= true

        return DefaultKafkaConsumerFactory<String,SignRequestV2>(configProps)
    }
}
