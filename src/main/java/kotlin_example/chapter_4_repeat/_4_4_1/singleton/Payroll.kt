package kotlin_example.chapter_4_repeat._4_4_1.singleton

import java.io.Serializable

object Payroll : Serializable {
    var payrollVersion: Int = 0
        set(value) {
            field = value
        }
    private val employees = arrayListOf("A", "B", "C", "D")
    fun showAllEmployees() {
        employees.forEach { print(it) }
    }
}