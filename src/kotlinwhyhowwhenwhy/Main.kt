package kotlinwhyhowwhenwhy

import kotlinwhyhowwhenwhy.classes.CustomerKotlin
import kotlinwhyhowwhenwhy.overloading.printMessage

fun main() {
    val customerKotlin = CustomerKotlin(
        1,
        "Morton Cornelius",
        "mortoncornelius@gmail.com")

    printMessage(
        customerKotlin.name ?: "",
        customerKotlin.id.toString(),
        customerKotlin.email ?: ""
    )
}