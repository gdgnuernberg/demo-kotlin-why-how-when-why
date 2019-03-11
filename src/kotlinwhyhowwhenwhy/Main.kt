package kotlinwhyhowwhenwhy

import kotlinwhyhowwhenwhy.overloading.OverloadedMethodsInJava
import kotlinwhyhowwhenwhy.overloading.printMessage

fun main() {
    printMessage("Message")
    printMessage("Message", "Great")
    printMessage("Message", "Great", "!")
    printMessage(prefix = "Great", suffix = "!", message = "Message")

    OverloadedMethodsInJava().printMessage("From Kotlin")
}