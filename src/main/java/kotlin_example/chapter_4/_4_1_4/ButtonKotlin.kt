package kotlin_example.chapter_4._4_1_4

class ButtonKotlin : View {

    override fun getCurrentState() = ButtonKotlinState()

    override fun restoreState(state: State) {}

    // Identical Java static `vlozhennij-nested` class, class has not referenced to outer class
    class ButtonKotlinState : State {}

    // Identical Java `vnutrennij-inner` class, inner class has already a reference to outer class
    inner class ButtonKotlinStatee : State {
        fun getOuterReference(): ButtonKotlin = this@ButtonKotlin
    }

}
