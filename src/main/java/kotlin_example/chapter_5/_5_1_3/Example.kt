package kotlin_example.chapter_5._5_1_3

val sum = { x: Int, y: Int -> println("the sum: ${x + y}") }

private fun main() {
    sum(2, 5)
    run { sum(2, 3) }

    //{ println(23) }()
    run { println(23) }
}