package kotlin_example.chapter_7._7_2_2

data class Person(var firstName: String, var lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::firstName, Person::lastName)
    }
}


private fun main() {
    val t = Person("M_and", "T")
    val e = Person("M_and", "E")
    val a = Person("M_and", "A")

    val persons = arrayListOf(t, e, a)

    persons.sort()
    val map = persons.groupBy { it.lastName }
    println("map: $map")
    println(persons[1])
    println(persons[2])
    println(persons)

    println(t > a)
    println(e <= a)

    println("t m_nd: ${t[1]}, ${t[0]}")
    t[0] = "M"
    println(t)

}