package kotlin_example.chapter_9._9_2_2

private val objects = listOf("one", 2, "three", null, '5')
private val objects2 = listOf("one", 2, "three", 5, null, '5', 4)

fun main() {
    val strings = objects.filterIsInstance<String>()
    println(strings)
    println(objects.filterIsInstance<Char>())

    val integers = hashSetOf(1, 3, 6)
    objects2.filterIsInstanceTo(integers)
    println(integers)

    println(isA<String>("T"))
    println(isA<Int>("T"))
    println(isA<String>(123))
}

private inline fun <reified T> isA(value: Any) = value is T
