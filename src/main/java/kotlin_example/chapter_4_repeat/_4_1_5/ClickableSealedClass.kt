package kotlin_example.chapter_4_repeat._4_1_5

sealed class ClickableSealedClass {
    abstract fun click()
    class RightButton : ClickableSealedClass() {
        override fun click() = println()
        override fun equals(other: Any?): Boolean {
            return this === other
        }

        override fun hashCode(): Int {
            return System.identityHashCode(this)
        }
    }

    inner class LeftButton : ClickableSealedClass() {
        override fun click() = println()
        override fun equals(other: Any?): Boolean {
            return this === other
        }

        override fun hashCode(): Int {
            return System.identityHashCode(this)
        }
    }
}


fun main() {
    val richButton = ClickableSealedClass.RightButton()
}
