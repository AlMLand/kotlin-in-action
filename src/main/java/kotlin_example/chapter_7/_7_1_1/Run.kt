package kotlin_example.chapter_7._7_1_1

private fun main() {
    val point1 = Point(2, 3)
    val point2 = Point(4, 5)
    val resultPointByPlus = point1 + point2
    println(resultPointByPlus)

    val resultPointByMinus = point2 - point1
    println(resultPointByMinus)

    val resultPointTimesByDouble = point1 * 1.5
    println(resultPointTimesByDouble)

    val resultPointTimesByCount = point2 * 4
    println(resultPointTimesByCount)

    var p1 = Point(2, 6)
    val p2 = Point(4, 7)
    p1 += p2
    println(p1)

    val list = ArrayList<Point>()
    list += p1
    println(list)
    list -= p1
    println("list -= p1: $list")
}
