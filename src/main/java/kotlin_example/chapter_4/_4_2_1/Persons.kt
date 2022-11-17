package kotlin_example.chapter_4._4_2_1

fun main() {
    val employee = Employee("T", "M_and", age = 5)
    println("employee: ${employee.getFullName()}")

    val defaultEmployee = DefaultEmployee()
    println("default employee: ${defaultEmployee.getFullName()}")
}


interface FullName {
    fun getFullName(): String
}

open class Person(private val firstName: String, private val lastName: String) : FullName {
    final override fun getFullName() = "$firstName $lastName"
}

class Employee(firstName: String, lastName: String, private val age: Int) : Person(firstName, lastName)

class DefaultEmployee private constructor
    (firstName: String, lastName: String, private val address: String) : Person(firstName, lastName) {
    constructor() : this("defaultFirstName", "defaultLastName", "defaultAddress")
}
