package com.example.demokafkaproducer

import org.springframework.beans.factory.getBeanNamesForAnnotation
import java.time.LocalTime
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.kafka.core.KafkaTemplate
import ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields
import ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent
import ru.tinkoff.bpm.pledge.submission.registration.process.UpdateSubmissionEvent
import ru.tinkoff.sme.cryptobpm.responses.ErrorDescription
import ru.tinkoff.sme.cryptobpm.responses.FileRef
import ru.tinkoff.sme.cryptobpm.responses.SignResponseV2

@SpringBootApplication
class DemoKafkaProducerApplication {
    //    @KafkaListener(topics = ["hello.topic"], id = "hfajoafjoajoajaoj")
    fun listen(event: String) {
        println("Hello")
    }
}

fun testRunDifferentMessage(app: ConfigurableApplicationContext) {
    val template = app.getBean(KafkaTemplate::class.java) as KafkaTemplate<String?, StartEvent?>
    val updateTemplate = app.getBean(KafkaTemplate::class.java) as KafkaTemplate<String?, UpdateSubmissionEvent?>
    val now = LocalTime.now().minute
    for (i in 1..5) {
        val id = i + now
        template.send(
            "pledge.submission-registration.process",
            StartEvent(i.toString(), "I don't know $i", id.toString(), AdditionalFields())
        )
        updateTemplate.send(
            "pledge.submission-registration.process",
            UpdateSubmissionEvent(id.toString())
        )
    }
}

fun testRunStartEvent(template: KafkaTemplate<String?, StartEvent>) {
    template.send(
        "pledge.submission-registration.process",
        StartEvent(
            "AUTO202099q9010z11VSQ2130Ns",
            "SUBMISSION",
            "20220819100916915PMP38062945c6",
            AdditionalFields("3202219-456564", 1623409245, 1623409245, "4545445")
        )
    )

}

fun testPmpStartEvent(template: KafkaTemplate<String?, ru.tinkoff.bpm.pledge.mortgage.StartEvent>) {
    template.send(
        "bpm.pledge-mortgage.create",
        ru.tinkoff.bpm.pledge.mortgage.StartEvent(
            "AUTO20210903171112VSQ273171",
            "20220726112819626PLES119825761",
            "AUTO20210903171112VSQ294401_61",
            154389
        )
    )

}

fun testPmpSignEvent(template: KafkaTemplate<String?, SignResponseV2>) {
    val signResponseV2 = SignResponseV2(
        "7231fe28-1301-4428-b5f2-3f13dfbcb9ed",
        "pledge-mortgage-process",
        true, ErrorDescription("",""),
        listOf(
            FileRef("301243212-5-3019NDZ78","s3://top-rosreestr-prod/signatures/20220802222426357PMP90bcfc4ec8"),
            FileRef("301243214-5-3019NDZ78","s3://top-rosreestr-prod/signatures/20220802222426357PMP90bcfc4ec8")))
//    pmpKafkaTemplate.send(
//        ProducerRecord(
//            "sme.cement.out", "20220802222426357PMP90bcfc4ec8",signResponseV2))
//    20220810112013948PMP536ece748a
//    20220810111326824PMP71a66742a0

    template.send(
        "sme.cement.out",
        "20220810112013948PMP536ece748a",
        signResponseV2
    )
}


fun main(args: Array<String>) {
    val app = runApplication<DemoKafkaProducerApplication>(*args)
//    app.getBean(ConsumerFactory::class.java).let {
//        Logger.getLogger("DemoKafkaProducerApplication").info(it.configurationProperties.toString())
//    }
//    testPmpStartEvent(app.getBean("startEventKafkaTemplate") as KafkaTemplate<String?, ru.tinkoff.bpm.pledge.mortgage.StartEvent>)
//    testPmpSignEvent(app.getBean(KafkaTemplate::class.java) as KafkaTemplate<String?, SignResponseV2>)
}
