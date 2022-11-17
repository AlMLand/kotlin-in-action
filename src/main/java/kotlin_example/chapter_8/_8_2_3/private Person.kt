package kotlin_example.chapter_8._8_2_3

private data class Person(
    val name: String,
    val age: Int
)

private val persons = listOf(
    Person("A", 37),
    Person("T", 5)
)


private fun main() {
    println(persons.filter { it.age < 30 })
    println(getListWithYoungAs(30, persons))
}

private fun getListWithYoungAs(goalAge: Int, persons: List<Person>): List<Person> {
    val people = mutableListOf<Person>()
    for (person in persons) {
        if (person.age < goalAge) people.add(person)
    }
    return people
}