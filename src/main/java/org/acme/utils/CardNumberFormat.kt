package org.acme.utils

fun hideCreditCardNumber(creditCardNumber: String): String {
    if (creditCardNumber.length <= 4) {
        return creditCardNumber
    }
    return "**** **** **** " + creditCardNumber.substring(creditCardNumber.length - 4)
}