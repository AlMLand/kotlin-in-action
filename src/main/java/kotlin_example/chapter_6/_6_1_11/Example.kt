package kotlin_example.chapter_6._6_1_11

private fun main() {
    val person = Person("T")
    println(getPersonNameToUpperCase(person))
    val person2 = Person(null)
    println(getPersonNameToUpperCase(person2))
}

private fun getPersonNameToUpperCase(person: Person) = (person.name ?: "no name are available").uppercase()
