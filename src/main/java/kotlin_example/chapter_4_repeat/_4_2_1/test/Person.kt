package kotlin_example.chapter_4_repeat._4_2_1.test

private data class Person(val firstName: String, val lastName: String, override var age: Int) : AllPeople(age) {
    var available: Boolean = false
    //override fun toString(): String {
    //  return "Person(firstName=$firstName, lastName=$lastName, available=$available)"
    //}
}


fun main() {
    val person = Person("T", "M_nd", 5)
    println(person)
    person.available = true
    println(person)
}