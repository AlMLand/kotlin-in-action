package kotlin_example.chapter3.f

fun main() {
    println(setOf(1, 2, 3, 4, 5).myJoinToString(limit = 3))
    println(arrayListOf("one", "two", "three", "four", "five").join())
}

private const val SEPARATOR = ","
private const val PREFIX = "{"
private const val POSTFIX = "}"
private const val LIMIT = 0
private const val TRUNCATED = "..[END]"

// zdes ja rasschiril class Collection i dobavil k nemu novij method -> myJoinToString
fun <T> Collection<T>.myJoinToString(
    separator: String = SEPARATOR,
    prefix: String = PREFIX,
    postfix: String = POSTFIX,
    limit: Int = LIMIT,
    truncated: String = TRUNCATED
): String {
    val sb = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        when {
            index < limit || limit == 0 -> if (index != this.size - 1) sb.append(
                element,
                if (index + 1 != limit) separator else ""
            ) else sb.append(element)

            index == limit -> sb.append(truncated)
        }
    }
    sb.append(postfix)
    return sb.toString()
}

fun Collection<String>.join() = myJoinToString(separator = " | ", limit = 4, prefix = "!!! ", postfix = " !!!")