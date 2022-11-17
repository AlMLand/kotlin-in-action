package kotlin_example.chapter_4_repeat._4_1_1

internal open class TalkativeButton : Focusable {
    private fun yell() = println("yell")
    protected fun whisper() = println("whisper")
    internal fun call() = println("call")
}

internal fun TalkativeButton.giveSpeech() {
    call()
}