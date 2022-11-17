package kotlin_example.chapter_7._7_4

import kotlin_example.chapter_7._7_1_1.Point

private fun main() {
    val point = Point(11, 99)
    val (byX, byY) = point
    println("point x: $byX | point y: $byY")


}
