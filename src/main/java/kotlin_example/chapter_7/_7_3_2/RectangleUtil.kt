package kotlin_example.chapter_7._7_3_2

import kotlin_example.chapter_7._7_1_1.Point

operator fun Rectangle.contains(point: Point): Boolean {
    return point.x in upperLeft.x until lowerRight.x
            && point.y in upperLeft.y until lowerRight.y
}
