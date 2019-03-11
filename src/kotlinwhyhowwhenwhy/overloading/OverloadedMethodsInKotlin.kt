package kotlinwhyhowwhenwhy.overloading

fun printMessage(message: String, prefix: String? = "", suffix: String = "") {
    println("$prefix $message $suffix")
}