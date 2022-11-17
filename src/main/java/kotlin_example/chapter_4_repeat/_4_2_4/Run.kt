package kotlin_example.chapter_4_repeat._4_2_4

fun main() {
    val employeeA = Employee(
        "A", "M_nd"
    ).apply {
        age = 37
        address = Address("Dresden", "El.", 10)
    }
    println(employeeA)

    println()

    val employeeT = Employee(
        "T", "M_nd", 5,
        Address("Dresden", "El.", 10)
    )
    println(employeeT)
}