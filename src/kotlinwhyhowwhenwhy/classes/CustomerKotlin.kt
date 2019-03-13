package kotlinwhyhowwhenwhy.classes

// Kotlin has only properties - no fields
data class CustomerKotlin @JvmOverloads constructor(
    val id: Int,
    @JvmField var name: String? = null,
    var email: String? = null
)