package kotlinwhyhowwhenwhy

import kotlinwhyhowwhenwhy.classes.CustomerJava
import kotlinwhyhowwhenwhy.classes.CustomerKotlin
import org.junit.Test

import org.junit.Assert.*

class ClassesTests {

    @Test
    fun `ensure that Java objects equal each other`() {
        val customer1 = CustomerJava(1)
        customer1.name = "Morton Cornelius"
        customer1.email = "mortoncornelius@gmail.com"
        val customer2 = CustomerJava(customer1)

        assertEquals(customer1, customer2)
        assertTrue(customer1.equals(customer2))
        assertEquals(customer1.hashCode(), customer2.hashCode())

        val customer3 = CustomerJava(customer2)
        customer3.name = "Petreus Karakis"
        assertEquals(customer3.name , "Petreus Karakis")
    }

    @Test
    fun `ensure that Kotlin objects equal each other`() {
        val customer1 = CustomerKotlin(1)
        customer1.name = "Morton Cornelius"
        customer1.email = "mortoncornelius@gmail.com"
        // Do Kotlin deep copy
        val customer2 = customer1.copy()

        assertEquals(customer1, customer2)
        assertEquals(customer1.hashCode(), customer2.hashCode())

        // Do Kotlin deep copy but override name
        val customer3 = customer2.copy(name = "Petreus Karakis")
        assertEquals(customer1.id, customer3.id)
        assertEquals(customer1.email, customer3.email)
        assertEquals(customer3.name , "Petreus Karakis")
    }

    @Test
    fun `check if Kotlin and Java objects equal each other`() {
        val customer1 = CustomerKotlin(
            1,
            "Morton Cornelius",
            "mortoncornelius@gmail.com")

        val customer2 = CustomerJava(1)
        customer2.name = "Morton Cornelius"
        customer2.email = "mortoncornelius@gmail.com"

        assertNotEquals(customer1, customer2)
        assertNotEquals(customer1.hashCode(), customer2.hashCode())
    }
}