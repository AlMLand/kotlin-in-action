package kotlin_example.chapter_6._6_1_5

private class Person(var firstName: String, var lastName: String) {
    constructor() : this("d", "c")

    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person ?: return false
        return firstName == otherPerson.firstName && lastName == otherPerson.lastName
    }

    override fun hashCode(): Int {
        return firstName.hashCode() * 31 + lastName.hashCode()
    }
}


private fun main() {
    val person = Person("T", "M_nd")

    println(person == person)
    println(person == null)
    println(person.equals(23))
    println(Person().apply {
        firstName = "YYY"
        lastName = "XXX"
    }.firstName)
}