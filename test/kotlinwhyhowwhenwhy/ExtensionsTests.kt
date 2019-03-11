package kotlinwhyhowwhenwhy

import kotlinwhyhowwhenwhy.classes.CustomerKotlin
import kotlinwhyhowwhenwhy.extensions.hasEmail
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ExtensionsTests {

    @Test
    fun `extension functions`() {
        val customerList: List<CustomerKotlin> = listOf(
            CustomerKotlin(1, "Morton Cornelius", "mortoncornelius@gmail.com"),
            CustomerKotlin(2, "Petreus Karakis", "petreus.karakis@hotmail.de"),
            CustomerKotlin(3, "Moritz Steinert", "moritz.steinert@gmail.com"),
            CustomerKotlin(4, "Felix Antoine Blume", "kollegah@gmail.com"),
            CustomerKotlin(5, "Jacques Loussier")
        )

        assertTrue { customerList.first().hasEmail() }
        assertFalse { customerList.last().hasEmail() }

        val customerWithoutEmail = customerList.filter { !it.hasEmail() }
        assertTrue { customerWithoutEmail.size == 1 }
        assertFalse { customerWithoutEmail[0].hasEmail() }
    }
}