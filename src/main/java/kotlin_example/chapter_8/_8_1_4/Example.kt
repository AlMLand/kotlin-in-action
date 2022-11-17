package kotlin_example.chapter_8._8_1_4

import java.util.*

private fun main() {
    val strings = listOf("A", "b", "C", "d", "E", "f")
    println(strings.joinToString())
    println(strings.joinToStringLambda())
    println(strings.joinToStringLambda(separator = "; ", postfix = "!") { it.lowercase(Locale.getDefault()) })
    println(strings.joinToStringLambda(transform = { it.uppercase(Locale.getDefault()) }))

    val stringsAndNulls = listOf("A", null, "b", "C", "d", null, "E", "f")
    println(stringsAndNulls.joinToStringLambdaNull())
    println(stringsAndNulls.joinToStringLambdaNull { it?.uppercase() ?: "null value" })
}

private fun <T> Collection<T>.joinToStringLambda(
    separator: String = ",",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = { it.toString() }
): String {
    val result = StringBuilder(prefix)
    forEachIndexed { index, element ->
        result.append(transform(element))
        if (index < size - 1) result.append(separator)
    }
    return result.append(postfix).toString()
}

private fun <T> Collection<T>.joinToStringLambdaNull(
    separator: String = ",",
    prefix: String = "",
    postfix: String = "",
    transform: ((T) -> String)? = null
): String {
    val result = StringBuilder(prefix)
    forEachIndexed { index, element ->
        // variant 1 -> prowerka na null
//        result.append(transform?.let { transform(element) } ?: "[the null value]")
        // variant 2 -> prowerka na null
//        if (transform != null) {
//            result.append(transform(element))
//        }
        // variant 3 -> utwerzhdenie chto ne null
//        result.append(transform!!(element))
        // variant 4 -> prowerka na null
        result.append(transform?.invoke(element) ?: element.toString())
        if (index < size - 1) result.append(separator)
    }
    return result.append(postfix).toString()
}

private fun <T> Collection<T>.joinToString(
    separator: String = ",",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = { it.toString() }
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in withIndex()) {
        result.append(transform(element))
        if (index < size - 1) result.append(separator)
    }
    return result.append(postfix).toString()
}

