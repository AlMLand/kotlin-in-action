package kotlin_example.chapter_7._7_3_4

import java.time.LocalDate
import java.time.Month

private fun main() {
    val date1 = LocalDate.of(1985, Month.JUNE, 5)
    val date2 = LocalDate.of(2017, Month.AUGUST, 8)
    val date3 = LocalDate.of(1986, Month.SEPTEMBER, 16)

    println(date3 in date1..date2)
    val listDate = arrayListOf(date3..date1)
    //listDate.forEach { print(it) }


    for (date in date1..date3) {
        println(date)
    }
}

private operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
        var count = 0
        var current = start
        override fun hasNext() = current <= endInclusive

        override fun next(): LocalDate = current.apply {
            println(++count)


            current = plusYears(1)
            println("TEST: $current")
            current = minusYears(1)


            current = plusYears(1)
        }
    }