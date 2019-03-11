package kotlinwhyhowwhenwhy.overloading

object PrinterKotlin {
    fun printMessage(message: String, prefix: String? = "", suffix: String = "") {
        println("$prefix $message $suffix")
    }
}