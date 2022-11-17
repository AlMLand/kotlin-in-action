package kotlin_example.chapter_4._4_2_5

private class LengthCounter(private val text: String) {

    val counter: Int = addText(text)

    private fun addText(value: String) = value.length
}

private fun main() {
    val lc = LengthCounter("T")
    println(lc.counter)
}
