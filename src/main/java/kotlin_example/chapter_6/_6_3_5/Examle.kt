package kotlin_example.chapter_6._6_3_5

private fun main() {
    val array: Array<String> = arrayOf("a", "b", "c")

    for (index in array.indices) {
        println("the index: $index has value: ${array[index]}")
    }

    var count = 0
    array.forEach { println("the index: ${count++} has value: $it") }

    val array2 = Array(3) { i -> ('a' + i).toString() }
    var count2 = 0
    array2.forEach { println("the index: ${count2++} has value: $it") }

    val array3 = Array(10) { i -> 1 + i }
    array3.forEach { print("$it ") }
    println()

    val ar = IntArray(3)
    println(ar.joinToString())
    val ar2 = IntArray(3) { i -> 1 + i }
    println(ar2.joinToString())
    val ar3 = intArrayOf(1, 2, 3)
    println(ar3.joinToString())
    ar3.forEachIndexed { index, element -> println("the index: $index has element $element") }
}