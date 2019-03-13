@file:JvmName("CustomKotlinUtils")

package kotlinwhyhowwhenwhy.extensions

import kotlinwhyhowwhenwhy.classes.CustomerKotlin

fun CustomerKotlin.hasEmail(): Boolean = !this.email.isNullOrBlank()