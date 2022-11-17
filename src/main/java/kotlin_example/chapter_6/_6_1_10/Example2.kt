package kotlin_example.chapter_6._6_1_10

private fun main() {
    val text = "text"
    val noText: String? = null
    val number = 343

    printAny(text)
    printAny(number)
}


private fun <T : Any> printAny(t: T) = println(t.hashCode())
