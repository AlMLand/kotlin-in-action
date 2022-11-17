package kotlin_example.chapter_7._7_5_1

import kotlin.reflect.KProperty

private class Person(val firstName: String, val lastName: String) {
    val role: String by Delegate()
}

private class Delegate {
    operator fun getValue(person: Person, property: KProperty<*>): String {
        TODO("Not yet implemented")
    }
}


private fun main() {
    val person = Person("T", "M_nd")
    val delegate = Delegate()
}