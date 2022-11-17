package kotlin_example.chapter_9._9_2_1

val strings = listOf("a", "b", "c")
val integersList = listOf(1, 2, 3)
val integersSet = setOf(1, 2, 3)

fun main() {
    if (strings is List<String>) println("is list with strings -> check main type: List and type of elements: String")
    if (strings is List<*>) println("is list, check only the main type: List")
    println(printJoinStrings(strings))

    println(printSum(integersList))
    //println(printSum(integersSet))
    //println(printSum(strings))

    val listWithStrings: List<*> = listOf("q", "f", "t")
    println(printJoinStrings(listWithStrings))

    val listWithIntegers = listOf(1, 3, 6)
    println(printJoinStrings(listWithIntegers))
}

private fun printJoinStrings(c: Collection<*>) =
    (c as? List<String> ?: throw IllegalArgumentException("aaaaaaaaa")).joinToString(separator = "")

private fun printSum(c: Collection<*>): Int {
    val collection = c as? List<Int> ?: throw IllegalArgumentException("aaaaaaaaa")
    return collection.sum()
}
