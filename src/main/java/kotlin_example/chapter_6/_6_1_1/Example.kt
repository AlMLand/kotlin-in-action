package kotlin_example.chapter_6._6_1_1

private fun main() {
    var text: String? = null
    var message = "message"

    println(stringLength(text))
    println(stringLength(message))
}

private fun stringLength(s: String?) = s?.length