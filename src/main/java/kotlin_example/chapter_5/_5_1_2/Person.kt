package kotlin_example.chapter_5._5_1_2

private data class Person(val name: String, val age: Int)

private const val DEFAULT_NAME = "defaultName"
private fun getDefaultName() = DEFAULT_NAME

private fun main() {
    val persons = listOf(
        Person("T", 5),
        Person("E", 36),
        Person("A", 37)
    )

    persons.map { it.name }.forEach { print("$it, ") }
    println()
    persons.map(Person::name).forEach { print("$it, ") }
    println()
    persons.forEach { _ -> print("${run(::getDefaultName)}, ") }
    println()

    //val personMaxAge = persons.maxByOrNull { person: Person -> person.age }
    //val personMaxAge = persons.maxByOrNull { person -> person.age }
    //val personMaxAge = persons.maxByOrNull { it.age }
    val personMaxAge = persons.maxByOrNull(Person::age)
    println(personMaxAge)

    //val personMinAge = persons.minBy { it.age }
    val personMinAge = persons.minBy(Person::age)
    println(personMinAge)

    //val personsAsString = persons.sortedBy { p -> p.name }.joinToString(", ") { it.name }
    val personsAsString = persons.sortedBy { p -> p.name }.joinToString(separator = ", ", transform = { it.name })
    println(personsAsString)
}