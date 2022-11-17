package kotlin_example.chapter_4_repeat._4_1_1

open class RichButton(val name: String) : Clickable {
    private fun disable() {}
    open fun animate() {}
    final override fun click() {}
}

class TopButton(name: String) : RichButton(name) {
    override fun animate() {
        super.animate()
    }
}


fun main() {
    val richButton = RichButton("s")
    richButton.animate()
}