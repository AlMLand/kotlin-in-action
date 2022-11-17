package kotlin_example.chapter_4_repeat._4_4_2.test1

data class Person private constructor(
    private val firstName: String,
    private val lastName: String,
    private var age: Int
) {
    companion object CreatePerson : CreateInstancePerson {
        override fun getInstancePerson(f: String, l: String, a: Int): Person {
            return Person(f, l, a).apply {
                println("new person with firstName=$firstName, lastName=$lastName, age=$age")
            }
        }
    }
}

fun Person.CreatePerson.getInstanceFromAge(a: Int): Person {
    val firstName = "defaultFirstName"
    val lastName = "defaultLastName"
    return getInstancePerson(firstName, lastName, a)
}