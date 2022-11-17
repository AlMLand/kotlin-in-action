package kotlin_example.chapter_6._6_2_2

private class Person(val name: String, val age: Int? = null)

private fun Person.isOlderAs(other: Person): Boolean? {
    if (age == null || other.age == null)
        return null
    return age > other.age
}

private fun String.getAsInt(): Int {
    with(this) {
        if (isNotBlank() && all { it.isDigit() }) return toInt() else return -1
    }
}


private fun main() {
    println("T".getAsInt())
    println("33".getAsInt())


    println(Person("T", 5).isOlderAs(Person("E", 36)))
    println(Person("A", 37).isOlderAs(Person("E", 36)))
    println(Person("T", 5).isOlderAs(Person("E")))


    val b: Byte = 1
    val l = b + 3L


    val i = 1_222_333.0f
    val integer: Int = 1
    val long: Long = integer.toLong()
}