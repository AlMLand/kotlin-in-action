package kotlin_example.chapter_4._4_1_1

class Button : Clickable, Focusable {
    override fun click() = println("I was clicked.")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main() {
    val button = Button()
    button.showOff()
    button.click()
    button.setFocus(true)
}