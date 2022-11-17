package kotlin_example.chapter_4._4_1_2

private class AnimatedChild : Animated() {
    override fun animate() {}
}

private val options = "Option1"

private fun printOption() = println(options)

private fun main() {
    printOption()
}