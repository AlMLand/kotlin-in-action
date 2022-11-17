package kotlin_example.chapter_6._6_1_9

private fun main() {
    val s = "test"
    fillWithInput(s)
    val s2 = null
    fillWithInput(s2)
    val s3 = "   "
    fillWithInput(s3)
}

private fun fillWithInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("pass correct input")
    } else
        println("$input")
}