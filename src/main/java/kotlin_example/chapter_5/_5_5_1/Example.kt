package kotlin_example.chapter_5._5_5_1

private fun main() {
    println(alphabet1New())
    println(alphabet2New())
}


private fun alphabet1(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nI know the alphabet!")
    return result.toString()
}

private fun alphabet1New() = with(StringBuilder()) {
    for (letter in 'A'..'Z')
        append(letter)
    append("\nI know the alphabet!")
}

private fun alphabet2(): String {
    val result = StringBuilder()
    generateSequence('A') { it + 1 }.takeWhile { it.isLetter() }.forEach { result.append(it) }
    result.append("\nI know the alphabet!")
    return result.toString()
}

private fun alphabet2New() = with(StringBuilder()) {
    generateSequence('A') { it + 1 }.takeWhile { it.isLetter() }.forEach { append(it) }
    append("\nI know the alphabet!")
}
