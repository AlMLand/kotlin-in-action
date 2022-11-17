package kotlin_example.chapter_4_repeat._4_4_2.test1

fun main() {
    val person = Person.getInstancePerson("A", "B", 3)
    println(person)
    val person2 = Person.CreatePerson.getInstanceFromAge(33)
    println(person2)
}
