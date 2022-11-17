package kotlin_example.chapter_8._8_3_1

private val persons = listOf(
    Person("A", 36),
    Person("E", 37),
    Person("T", 5)
)

private fun main() {
    lookForT(persons)
    lookForTWithForEach(persons)
}

private fun lookForTWithForEach(persons: List<Person>) {
    val t = "T"
    persons.forEach {
        if (it.name == t) {
            println("the $t is found!")
            return
        }
    }
    println("the $t is not found")
}

private fun lookForT(persons: List<Person>) {
    val t = "T"
    for (person in persons) {
        if (person.name == t) {
            println("the $t is found!")
            return
        }
    }
    println("the $t is not found")
}