package kotlin_example.chapter_5._5_2_1

private data class Person(val name: String, val age: Int)


private fun main() {
    val integers = listOf(1, 2, 3, 4)
    var count = 1
    integers.filter { it % 2 == 0 }.forEach { println("count: ${count++}, number: $it") }
    println(integers)

    val persons: List<Person> = listOf(
        Person("T", 5), Person("E", 36), Person("A", 37)
    )
    persons
        .filter { it.age > 30 }
        .sortedBy { it.name }
        .forEach { println("Person ${it.name} is older as 30, the age: ${it.age}") }

    var names = mutableListOf<String>()
    persons
        .filter { it.age > 23 }
        .map(Person::name)
        .sorted()
        .toCollection(names)
    println("the mutable list: $names")

    val mapPersons = hashMapOf(
        1 to Person("T", 5), 2 to Person("E", 36), 3 to Person("A", 37)
    )
    mapPersons
        .filter { it.value.age > 30 }
        .forEach { println("The key: ${it.key} has person with name: ${it.value.name}") }
}
