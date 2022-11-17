package kotlin_example.chapter_7._7_4

class PointLocal(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

fun main() {
    val p = PointLocal(11, 22)
    val (xCustom, yCustom) = p
    println("$xCustom | $yCustom")
}