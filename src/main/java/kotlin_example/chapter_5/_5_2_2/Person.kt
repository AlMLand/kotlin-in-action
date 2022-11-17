package kotlin_example.chapter_5._5_2_2

private data class Person(val name: String, val age: Int)


private fun main() {
    val persons = listOf(
        Person("T", 5),
        Person("E", 36),
        Person("A", 37)
    )

    val lastPerson = persons.findLast { it.age > 30 }
    println("last person: $lastPerson")

    val person = persons.find { it.age > 30 }
    println("person: $person")

    val newPersons = persons.filter { it.age > 30 }
    println(newPersons)
}