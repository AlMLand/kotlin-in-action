package kotlin_example.chapter_4._4_1_1

interface Focusable {
    fun setFocus(b: Boolean) = println("I'm ${if (b) "got" else "lost"} focus")
    fun showOff() = println("I'm focused")
}