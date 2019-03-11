package kotlinwhyhowwhenwhy

import kotlinwhyhowwhenwhy.classes.CustomerKotlin
import kotlinwhyhowwhenwhy.nullability.NullableJava
import kotlinwhyhowwhenwhy.nullability.getBucketFor
import kotlinwhyhowwhenwhy.nullability.getCustomerForName
import kotlinwhyhowwhenwhy.nullability.getIndexFor
import org.junit.Test
import kotlin.test.assertFalse

class NullTests {

    @Test
    fun `null checks in Java`() {
        val optionalIndex = NullableJava.INSTANCE.getOptionalIndexFor(
            99,
            listOf(100, 200, 300)
        )

        assertFalse { optionalIndex.isPresent }

        val index = NullableJava.INSTANCE.getIndexFor(
            99,
            listOf(100, 200, 300)
        )

        println(index.toString())
    }

    @Test
    fun `null checks in Kotlin`() {
        val nullIndex = getIndexFor(99, 1..98)
        println(nullIndex.toString())

        val nullBucket = getBucketFor(10000)
        println(nullBucket?.name)
        // TODO use !!

        val nullCustomer = getCustomerForName("Beethoven")
        val customer = getCustomerForName("Beethoven", listOf(CustomerKotlin(0, "Beethoven")))

        println(nullCustomer?.id?.toString())
        nullCustomer?.let { println(it.toString()) }
        if (nullCustomer != null) {
            println(nullCustomer.name)
        }

        println(customer?.id?.toString())
        customer?.let { println(it.toString()) }
        if (customer != null) {
            println(customer.name)
        }
    }
}