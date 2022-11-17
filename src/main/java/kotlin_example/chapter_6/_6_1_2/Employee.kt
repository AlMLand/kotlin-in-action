package kotlin_example.chapter_6._6_1_2

private class Employee(val name: String, val manager: Employee?)


private fun main() {
    val e = Employee("T", null)
    println(e.manager?.name)

    val em = Employee("E", e)
    println(em.manager?.name)
}