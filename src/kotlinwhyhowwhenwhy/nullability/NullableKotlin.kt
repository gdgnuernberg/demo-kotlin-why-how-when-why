package kotlinwhyhowwhenwhy.nullability

import kotlinwhyhowwhenwhy.classes.CustomerKotlin
import kotlinwhyhowwhenwhy.expressions.Bucket

fun getIndexFor(number: Int, list: IntRange): Int? =
    if (list.contains(number)) list.indexOf(number) else null

fun getBucketFor(number: Int): Bucket? {
    return when {
        number < 10 -> Bucket.ONE
        number < 100 -> Bucket.TWO
        number < 1000 -> Bucket.THREE
        number < 10000 -> Bucket.FOUR
        else -> null
    }
}

fun getCustomerForName(
    name: String,
    customerList: List<CustomerKotlin> = listOf(
        CustomerKotlin(1, "Morton Cornelius", "mortoncornelius@gmail.com"),
        CustomerKotlin(2, "Petreus Karakis", "petreus.karakis@hotmail.de"),
        CustomerKotlin(3, "Moritz Steinert", "moritz.steinert@gmail.com"),
        CustomerKotlin(4, "Felix Antoine Blume", "kollegah@gmail.com"),
        CustomerKotlin(5, "Jacques Loussier")
    )
): CustomerKotlin? {

    customerList.forEach {
        if (it.name == name) {
            return it
        }
    }
    return null
    //return customerList.firstOrNull { (_, target, _) -> target == name }
}