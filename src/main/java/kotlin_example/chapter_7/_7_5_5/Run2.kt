package kotlin_example.chapter_7._7_5_5

private fun main() {
    val e = Person2()
    val data = hashMapOf("firstName" to "E", "lastName" to "M_and", "age" to "36")
    data.forEach { (key, value) -> e.setAttributes(key, value) }
    println("the firstName: ${e.firstName} | the lastName: ${e.lastName} | the age: ${e.age}")
}