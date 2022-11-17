package kotlin_example.chapter_4._4_4_1

import java.math.BigDecimal
import java.time.LocalDate
import java.time.Month

private object Payroll {
    val allEmployee = sortedSetOf(Person.PersonComparator)

    fun calculateSalary() {
        for (person in allEmployee) {
            when (person.getYears()) {
                in 0..0 -> person.salary = BigDecimal(11)
                in 1..4 -> person.salary = BigDecimal(22)
                in 5..9 -> person.salary = BigDecimal(33)
                in 10..59 -> person.salary = BigDecimal(44)
            }
        }
    }
}

private data class Person(
    private val firstName: String,
    private val lastName: String,
    private var jobStart: LocalDate
) : Comparable<Person> {

    var salary: BigDecimal = BigDecimal(0)
    fun getYears() = LocalDate.now().year - jobStart.year
    override fun compareTo(other: Person) = this.firstName.compareTo(other.firstName)

    // singleton implementation example in kotlin
    object PersonComparator : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int {
            var indicator = o1.firstName.compareTo(o2.firstName)
            if (indicator == 0)
                indicator = o1.lastName.compareTo(o2.lastName)
            return indicator
        }
    }

    // syntaxis dlja objavlenija, kak v Java static metodov ili peremennih,
    // tak kak sami klassi v Kotlin ne mogut imet staticheskih peremennih ili staticheskih methodov
    // object `companion` imeet dopusk ko wsem chlenam(tak zhe i k private members) verhnego klassa
    companion object {
        fun testThePersonAndPayroll() {
            Payroll.allEmployee.addAll(
                hashSetOf(
                    Person("A", "AAA", LocalDate.of(2000, Month.JANUARY, 1)),
                    Person("B", "BBB", LocalDate.of(2015, Month.JANUARY, 1)),
                    Person("C", "CCC", LocalDate.of(2020, Month.JANUARY, 1))
                )
            )
            Payroll.calculateSalary()
            Payroll.allEmployee
                .forEach { per -> println("The employee with name: ${per.firstName} has salary: ${per.salary}") }
        }
    }
}


private fun main() {
    Person.testThePersonAndPayroll()
}