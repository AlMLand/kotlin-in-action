package kotlin_example.chapter_7._7_1_3

import java.math.BigDecimal

private fun main() {
    var v = BigDecimal.ZERO
    v += BigDecimal.ONE
    println(v++)
    println(++v)
    println(v * BigDecimal(3))
}