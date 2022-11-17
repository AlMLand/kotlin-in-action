package kotlin_example.chapter_4._4_1_2

open class RightClick : Clickable {
    fun disable() = println("Right click disable")
    open fun animate() = println("Right click: animate")
    final override fun click() = println("Right click")
    override fun showOff() {
        super.showOff()
    }
}
