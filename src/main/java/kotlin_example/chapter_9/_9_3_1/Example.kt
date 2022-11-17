package kotlin_example.chapter_9._9_3_1

fun main() {
    val strings = listOf("abc", "def")
    printContents(strings)

    val mutableStrings = mutableListOf("abc", "def")
    val mutableIntegers = mutableListOf(1, 2, 3)
    //addAnswer(mutableIntegers)

    var n: Number = 3
    var i: Int = 2

    var sNotNull: String = "a"
    var sNull: String? = "j"
    sNull = sNotNull
}

private fun printContents(list: List<Any>) = println(list.joinToString())

private fun addAnswer(list: MutableList<Any>) = list.add(34)