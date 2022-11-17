package kotlin_example.chapter_7._7_5_3

private fun main() {
    val alex = Person("Alex", 37, 4500)
    alex.addVariableListener()
    alex.age = 38
    alex.salary = 9000
}
