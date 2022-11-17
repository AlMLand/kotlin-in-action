package kotlin_example.chapter_4._4_1_3

internal open class TalkativeButton : Clickable {
    final override fun click() = println("I was clicked")
    private fun yell() = println("yell")
    protected fun whisper() = println("whisper")
}

internal fun TalkativeButton.giveSpeech() {

}
