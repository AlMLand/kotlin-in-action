package kotlin_example.chapter2.a

data class Person(
    val name: String,
    val age: Int? = null
)

fun main() {
    val persons = listOf(Person("A"), Person("T", 5))
    val oldest = persons.maxBy { it.age ?: 0 }
    print("The oldest person is $oldest")
}