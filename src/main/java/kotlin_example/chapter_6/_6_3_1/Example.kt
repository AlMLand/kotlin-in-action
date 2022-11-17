package kotlin_example.chapter_6._6_3_1

import java.io.BufferedReader
import java.io.StringReader

private fun main() {
    val reader = BufferedReader(StringReader("11\ntest\n33"))
    println(readFrom(reader))

    val reader2 = BufferedReader(StringReader("44\n55\n66\ntest\n77"))
    val list2 = readFrom2(ArrayList(), reader2)
    println(list2)
    list2?.let { addValidNumbers(list2) }
    list2?.let { addValidNumbers2(list2) }
}

private fun readFrom(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number)
        } catch (nfe: NumberFormatException) {
            result.add(null)
        }
    }
    return result
}

private fun readFrom2(result: ArrayList<Int?>?, reader: BufferedReader): ArrayList<Int?>? {
    reader.lineSequence()
        .forEach { result?.add(it.toIntOrNull()) ?: throw IllegalArgumentException("the list is null") }
    return result
}

private fun addValidNumbers(list: List<Int?>) {
    var validNumSum = 0
    var countInvalidNum = 0
    list.forEach { if (it != null) validNumSum += it else countInvalidNum++ }
    println("valid sum: $validNumSum\ninvalid count: $countInvalidNum")
}

private fun addValidNumbers2(list: List<Int?>) {
    println(
        "valid sum: ${list.asSequence().filterNotNull().sum()}\ninvalid count: ${
            list.asSequence().filterNot { it != null }.count()
        }"
    )
}
