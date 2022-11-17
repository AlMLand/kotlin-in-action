package kotlin_example.chapter3.c

fun main() {
    println(myJoinToString(collection = list, limit = 3))
}

val list = setOf(1, 2, 3, 4, 5)

@JvmOverloads
fun <T> myJoinToString(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "{",
    postfix: String = "}",
    limit: Int = 0,
    truncated: String = "{tr_default}"
): String {
    val sb = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        when {
            index < limit || limit == 0 -> if (index != collection.size - 1) sb.append(
                element,
                separator
            ) else sb.append(element)

            index == limit -> sb.append(truncated)
        }
    }
    sb.append(postfix)
    return sb.toString()
}