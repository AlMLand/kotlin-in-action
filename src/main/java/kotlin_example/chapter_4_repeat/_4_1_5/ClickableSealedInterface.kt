package kotlin_example.chapter_4_repeat._4_1_5

sealed interface ClickableSealedInterface {
    fun click()

    class RightClick : ClickableSealedInterface {
        override fun click() = println("right click")
        override fun equals(other: Any?): Boolean {
            return this === other
        }

        override fun hashCode(): Int {
            return System.identityHashCode(this)
        }
    }

    class LeftButton : ClickableSealedInterface {
        override fun click() = println("left click")
        override fun equals(other: Any?): Boolean {
            return this === other
        }

        override fun hashCode(): Int {
            return System.identityHashCode(this)
        }
    }
}