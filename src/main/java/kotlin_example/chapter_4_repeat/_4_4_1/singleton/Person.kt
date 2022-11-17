package kotlin_example.chapter_4_repeat._4_4_1.singleton

data class Person(private val firstName: String, private val lastName: String) : Comparable<Person> {

    object PersonComparator : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int =
            compareValuesBy(o1, o2, Person::firstName, Person::lastName)
    }

    override fun compareTo(other: Person): Int =
        compareValuesBy(this, other, Person::firstName, Person::lastName)
}
