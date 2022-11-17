package kotlin_example.chapter2.d

fun main() {
    val rectangle = Rectangle(3, 3)
    println(rectangle.isSquare)

    println("Random: ${rectangle.createRandomRectangle()}")
}