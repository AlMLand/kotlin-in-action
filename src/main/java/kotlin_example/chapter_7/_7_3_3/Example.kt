package kotlin_example.chapter_7._7_3_3

import java.time.LocalDate
import java.time.Month

private fun main() {
    val a: LocalDate = LocalDate.of(1985, Month.JUNE, 5)
    val t: LocalDate = LocalDate.of(2017, Month.AUGUST, 8)
    val e: LocalDate = LocalDate.of(1986, Month.SEPTEMBER, 16)

    println(e in a..t)
}