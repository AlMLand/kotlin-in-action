package kotlin_example.chapter_5._5_2_3

private data class Person(val name: String, val age: Int)


private fun main() {
    val persons = listOf(
        Person("T", 5),
        Person("E", 36),
        Person("A", 37)
    )

    val mapPersonsByAge: Map<Int, List<String>> = persons
        .groupBy { it.age }
        .mapValues { itt -> itt.value.map { it.name } }
    println(mapPersonsByAge)
    println(mapPersonsByAge[5])

    val words = listOf("a", "t", "e", "m_and")
    val mapWordsByFirstLetter = words
        .asSequence()
        .sorted()
        .groupBy(String::first)
        .toMap()
    println(mapWordsByFirstLetter)
}
