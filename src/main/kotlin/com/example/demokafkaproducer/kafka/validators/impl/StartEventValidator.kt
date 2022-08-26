package ru.tinkoff.bpm.pledge.mortgage.process.event.validators.impl

import org.springframework.stereotype.Component
import ru.tinkoff.bpm.pledge.mortgage.StartEvent
import ru.tinkoff.bpm.pledge.mortgage.process.event.validators.EventValidator

/**
 * @author e.dukhnay
 */
@Component
class StartEventValidator : EventValidator<StartEvent> {

    override fun isValid(event: StartEvent): Boolean {
        return !event.appIntId.isNullOrBlank() && !event.pledgeIntId.isNullOrBlank()
    }
}
