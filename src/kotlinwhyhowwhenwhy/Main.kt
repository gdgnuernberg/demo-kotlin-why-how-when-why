package kotlinwhyhowwhenwhy

import javafx.scene.paint.Color
import kotlinwhyhowwhenwhy.classes.CustomerJava
import kotlinwhyhowwhenwhy.expressions.ExpressionsJava
import kotlinwhyhowwhenwhy.overloading.PrinterJava

fun main() {
    val customer = CustomerJava(0)
    customer.name = "Fritz Wellblech"

    val customer2: CustomerJava? = null
    println(customer2?.name)

    println(ExpressionsJava().isDrive(Color.RED))

    PrinterJava.INSTANCE.printMessage("Hey Kotlin")
}