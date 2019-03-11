package kotlinwhyhowwhenwhy.expressions

import javafx.scene.paint.Color

fun isDrive(color: Color): Boolean {
    return when (color) {
        Color.GREEN, Color.ORANGE -> true
        else -> false
    }
}

// TODO: convert to expression body
fun isDrive(color: String): Boolean {
    return if (color == "red") false else true
}

fun getBucketFor(number: Int): Bucket {
    return when {
        number < 10 -> Bucket.ONE
        number < 100 -> Bucket.TWO
        number < 1000 -> Bucket.THREE
        else -> Bucket.FOUR
    }
}

fun getRangeFor(bucket: Bucket): IntRange {
    return when (bucket) {
        Bucket.ONE -> Int.MIN_VALUE..9
        Bucket.TWO -> 10..99
        Bucket.THREE -> 100..999
        Bucket.FOUR -> 1000..Int.MAX_VALUE
    }
}

enum class Bucket {
    ONE,
    TWO,
    THREE,
    FOUR;
}