package kotlin_example.chapter2.d

import java.util.Random

class Rectangle(
    private val height: Int,
    private val width: Int) {

    val isSquare: Boolean
        get() = height == width

    fun createRandomRectangle(): Rectangle {
        val random = Random()
        return Rectangle(random.nextInt(), random.nextInt())
    }

    override fun toString(): String {
        return "Rectangle(height=$height, width=$width, isSquare=$isSquare)"
    }
}
