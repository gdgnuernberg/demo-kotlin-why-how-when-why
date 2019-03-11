package kotlinwhyhowwhenwhy

import kotlinwhyhowwhenwhy.classes.CustomerKotlin
import org.junit.Assert.*
import org.junit.Test

class PairsTest {

    @Test
    fun `pairs in java`() {
        val pairJavaFx = javafx.util.Pair("Morton", "Cornelius")
        val firstName = pairJavaFx.key
        val secondName = pairJavaFx.value

        assertEquals("Morton", firstName)
        assertEquals("Cornelius", secondName)
    }

    @Test
    fun `pairs in kotlin`() {
        val pair = Pair("Morton", "Cornelius")
        val firstName = pair.first
        val secondName = pair.second

        assertEquals("Morton", firstName)
        assertEquals("Cornelius", secondName)

        // Variable destructuring
        val (first, second) = pair
        assertEquals("Morton", first)
        assertEquals("Cornelius", second)
    }

    @Test
    fun `variable destructuring in data classes`() {
        val customer = CustomerKotlin(
            1,
            "Morton Cornelius",
            "mortoncornelius@gmail.com"
        )

        val (id, name, email) = customer
        // TODO: delete next line
        assertEquals(1, id)
        assertEquals("Morton Cornelius", name)
        assertEquals("mortoncornelius@gmail.com", email)
    }
}