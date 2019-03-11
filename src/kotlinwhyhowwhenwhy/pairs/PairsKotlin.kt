package kotlinwhyhowwhenwhy.pairs

import kotlinwhyhowwhenwhy.overloading.PrinterKotlin

fun main() {
    val pair = Pair("Morton", "Cornelius")
    PrinterKotlin.printMessage(message = pair.first, suffix = pair.second)
}