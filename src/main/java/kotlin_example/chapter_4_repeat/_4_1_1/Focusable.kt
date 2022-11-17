package kotlin_example.chapter_4_repeat._4_1_1

interface Focusable {
    fun setFocus(focus: Boolean) = println("the focus is ${if (focus) "got" else "lost"}")
    fun showOff() = println("i'm method -> SHOWOFF and come from interface Focusable")
}