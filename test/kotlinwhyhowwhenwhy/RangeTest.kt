package kotlinwhyhowwhenwhy

import kotlinwhyhowwhenwhy.expressions.Bucket
import kotlinwhyhowwhenwhy.expressions.getBucketFor
import kotlinwhyhowwhenwhy.expressions.getRangeFor
import org.junit.Assert.*
import org.junit.Test

class RangeTest {

    @Test
    fun `test ranges`() {
        val bucket = getBucketFor(99)
        assertEquals(Bucket.TWO, bucket)
        val range = getRangeFor(bucket)
        assert(range.first == 10 && range.last == 99)

        assert(range.random() in 10..99)

        assertTrue(range.all { it in 10..99 })
    }
}