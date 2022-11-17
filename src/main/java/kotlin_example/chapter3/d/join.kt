// 3.2.3
@file: JvmName("StringUtil")

package kotlin_example.chapter3.d

// verhnij uroven svojstvo (analog static variable in java)
var count = 0

// const -> only for primitive and strings, not for other objects (analog public static final constant in java)
const val SEPARATOR = ","
const val PREFIX = "{"
const val POSTFIX = "}"
const val LIMIT = 0
const val TRUNCATED = "{tr_default}"

// verhnij uroven funkcija (analog static method in java)
fun <T> myJoinToString(
    collection: Collection<T>,
    separator: String = SEPARATOR,
    prefix: String = PREFIX,
    postfix: String = POSTFIX,
    limit: Int = LIMIT,
    truncated: String = TRUNCATED
): String {
    val sb = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        count++
        when {
            index < limit || limit == 0 -> if (index != collection.size - 1) sb.append(
                element,
                separator
            ) else sb.append(element)

            index == limit -> sb.append(truncated)
        }
    }
    sb.append(postfix)
    println("count= $count")
    return sb.toString()
}