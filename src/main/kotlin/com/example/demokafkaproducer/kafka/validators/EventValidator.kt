package ru.tinkoff.bpm.pledge.mortgage.process.event.validators

/**
 * @author e.dukhnay
 */
interface EventValidator<R> {
    fun isValid(event: R): Boolean
}
