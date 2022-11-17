package kotlin_example.chapter3.b

fun main(){
    println(list)
    println(list.joinToString(";", "(", ")", 2, "[end]"))
    println(myJoinToString(list, ";", "(", ")", 3, "[end]"))
    println(list.joinToString(separator = ";", prefix = "(", postfix = ")", limit = 4))
}

val list = setOf(1, 2, 3, 4, 5)

fun myJoinToString (collection: Collection<Int>,
                    separator: String,
                    prefix: String,
                    postfix: String,
                    limit: Int,
                    truncated: String): String {
    val sb = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        when {
            index < limit || limit == 0 -> if (index != collection.size - 1) sb.append(element, separator) else sb.append(element)
            index == limit -> sb.append(truncated)
        }
    }
    sb.append(postfix)
    return sb.toString()
}