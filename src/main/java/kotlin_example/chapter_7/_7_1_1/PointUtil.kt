package kotlin_example.chapter_7._7_1_1

operator fun Point.times(other: Point) = Point(x * other.x, y * other.y)
operator fun Point.times(other: Double) = Point((x * other).toInt(), (y * other).toInt())
operator fun Point.times(count: Int) = "$x$y".repeat(count)
operator fun Point.div(other: Point) = Point(x / other.x, y / other.y)
operator fun Point.rem(other: Point) = Point(x % other.x, y % other.y)
operator fun Point.minus(other: Point) = Point(x - other.x, y - other.y)
operator fun <T> MutableCollection<T>.minusAssign(element: T) {
    this.remove(element)
}

operator fun <T> MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}