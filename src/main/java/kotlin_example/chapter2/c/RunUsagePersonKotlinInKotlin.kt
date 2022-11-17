package kotlin_example.chapter2.c

fun main(args: Array<String>) {
    val personKotlin = PersonKotlin("T", false)
    val personJava = PersonJava("A", true)
    val persons = listOf(personKotlin, personJava)
    persons.forEach { println("Person: $it") }
    persons.forEach { println("Info: ${it.fullInfo}") }
}
