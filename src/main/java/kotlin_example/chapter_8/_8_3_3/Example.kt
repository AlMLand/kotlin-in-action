package kotlin_example.chapter_8._8_3_3

private const val searchedAge = 36

private val persons = listOf(
    Person("A", 37),
    Person("E", searchedAge),
    Person("T", 5)
)

private fun main() {
    persons
        .mapTo(mutableListOf()) { person -> person.age }
        .forEach(fun(age) {
            if (age == searchedAge) return
            println(age)
        })
}