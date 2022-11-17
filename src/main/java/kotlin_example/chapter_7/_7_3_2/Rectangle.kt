package kotlin_example.chapter_7._7_3_2

import kotlin_example.chapter_7._7_1_1.Point

data class Rectangle(val upperLeft: Point, val lowerRight: Point)


private fun main() {
    val rectangle = Rectangle(Point(10, 20), Point(50, 50))
    val point1 = Point(25, 40)
    val point2 = Point(5, 5)

    println(point1 in rectangle)
    println(rectangle.contains(point1))
    println(point2 in rectangle)
    println("CCC: " + (point1 in Point(1, 1)..Point(100, 100)))


    println(3 in 2..8)
    println(5 in 3.rangeTo(5))

    for (num in 2 until 7) {
        print(num)
    }
}
