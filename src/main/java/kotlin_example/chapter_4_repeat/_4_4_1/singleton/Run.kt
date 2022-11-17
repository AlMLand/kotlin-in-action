package kotlin_example.chapter_4_repeat._4_4_1.singleton

fun main() {
    val payroll = Payroll
    payroll.showAllEmployees()

    println()

    val p1 = Person("A", "B")
    val p2 = Person("C", "D")
    val p3 = Person("A", "B")
    println(Person.PersonComparator.compare(p1, p2))
    println(p1 == p2)
    println(Person.PersonComparator.compare(p1, p3))
    println(p1 == p3)
}