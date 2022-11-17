package kotlin_example.chapter_6._6_1_10

private fun main() {
    val text = "text"
    val noText: String? = null

    printAny(text)
    printAny(noText)
}


private fun <T> printAny(t: T) = println(t?.hashCode() ?: 0)
