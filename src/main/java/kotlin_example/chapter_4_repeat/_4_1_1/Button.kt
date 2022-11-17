package kotlin_example.chapter_4_repeat._4_1_1

class Button : Clickable, Focusable {
    override fun click() = println("i'm clicked")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}