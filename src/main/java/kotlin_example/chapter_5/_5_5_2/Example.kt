package kotlin_example.chapter_5._5_5_2

private data class Example(var firstName: String = "defaultFirstName", var lastName: String = "defaultLastName")

private fun main() {
    println(alphabet1())
    println(alphabet2())
    println(alphabet3())

    println(Example())
    println(Example().apply {
        firstName = "T"
        lastName = "M_nd"
    })
}

private fun alphabet1() = StringBuilder().apply {
    for (letter in 'A'..'Z')
        append(letter)
    append("\nI know the alphabet!")
}

private fun alphabet2() = StringBuilder().apply {
    generateSequence('A') { it + 1 }.takeWhile { it.isLetter() }.forEach { append(it) }
    append("\nI know the alphabet!")
}

private fun alphabet3() = buildString {
    generateSequence('A') { it + 1 }.takeWhile { it.isLetter() }.forEach { append(it) }
    append("\nI know the alphabet!")
}
