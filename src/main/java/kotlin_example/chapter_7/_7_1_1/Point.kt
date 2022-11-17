package kotlin_example.chapter_7._7_1_1

data class Point(val x: Int, val y: Int) : Comparable<Point> {
    operator fun plus(other: Point) = Point(x + other.x, y + other.y)
    override fun compareTo(other: Point) = compareValuesBy(this, other, Point::x, Point::y)
}

