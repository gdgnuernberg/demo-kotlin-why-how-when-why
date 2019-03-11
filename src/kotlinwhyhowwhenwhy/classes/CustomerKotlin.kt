package kotlinwhyhowwhenwhy.classes

// Kotlin has only properties - no fields
data class CustomerKotlin(
    val id: Int,
    var name: String? = null,
    var email: String? = null
)