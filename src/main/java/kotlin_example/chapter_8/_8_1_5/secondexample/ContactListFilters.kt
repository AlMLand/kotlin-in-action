package kotlin_example.chapter_8._8_1_5.secondexample

private class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPredicate(): (Person) -> Boolean {
        val startsWithPrefix = { person: Person ->
            person.firstName.startsWith(prefix, ignoreCase = true) ||
                    person.lastName.startsWith(prefix, ignoreCase = true)
        }
        if (!onlyWithPhoneNumber)
            return startsWithPrefix
        return { startsWithPrefix(it) && it.phoneNumber != null }
    }
}

private data class Person(val firstName: String, val lastName: String, var phoneNumber: String?)


private fun main() {
    val persons = listOf(
        Person("T", "M_and", "012345"),
        Person("A", "M_and", null),
        Person("E", "M_and", null)
    )
    val contactListFilters = ContactListFilters().apply {
        prefix = "t"
        onlyWithPhoneNumber = true
    }
    println(persons.filter(contactListFilters.getPredicate()))
}

