package kotlin_example.chapter_9._9_3_6

import kotlin.random.Random

fun main() {
    val list1 = mutableListOf('a', 2, "df")
    val list2 = mutableListOf('s', 'd', 'f')
    val listResult = if (Random.nextBoolean()) list1 else list2
    //listResult.add(23)
    println(listResult[0])
    printLast1(listResult)
    printLast2(listResult)
}

private fun printLast1(collection: MutableCollection<*>) {
    if (collection.isNotEmpty()) println(collection.last())
    else println("collection is empty")
}

// or

private fun <T> printLast2(collection: MutableCollection<T>) {
    if (collection.isNotEmpty()) println(collection.last())
    else println("collection is empty")
}