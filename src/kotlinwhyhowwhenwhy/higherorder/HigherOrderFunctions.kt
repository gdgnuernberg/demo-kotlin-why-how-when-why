package kotlinwhyhowwhenwhy.higherorder

object HigherOrderFunctions {
    fun triggerWorkInBackground(onFinishAction: (result: String) -> Unit) {
        Thread.sleep(3000)
        val isValid = listOf(true, false).random()

        val result = when (isValid) {
            true -> "The result is valid. But don't believe the hype."
            false -> "The result is not valid. Check out more at google.com."
        }

        onFinishAction(result)
    }
}

fun main() {
    HigherOrderFunctions.triggerWorkInBackground {
        println(it)
    }
}