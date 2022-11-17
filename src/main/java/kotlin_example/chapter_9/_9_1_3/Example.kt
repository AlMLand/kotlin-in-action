package kotlin_example.chapter_9._9_1_3

val integers = listOf(1, 2)
val doubles = listOf(1.1, 2.2, 3.3)
val strings = listOf("a", "b")

fun main() {
    println(integers.getCustomSize())
    println(doubles.getCustomSize())
    //println(strings.getSize())

    val i = 100
    println(i.getHalf<Int>())
    println(getOneThird(18))

    val text1 = "A"
    val text2 = "A"
    val text3 = "T"
    println(equalsCustom(text1, text2))
    println(equalsCustom(text1, text3))

    println(getMaxValue(text1, text3))
    println("the values: are ${getMaxValue(text1, text1) ?: "identical"}")
    println(getMaxValue2(text1, text3))

    val name = StringBuilder("T")
    ensureTrailingPeriod(name)
    println(name)
}

private fun <T> ensureTrailingPeriod(seq: T) where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
    }
}

private fun <T : Comparable<T>> getMaxValue2(first: T, second: T) = if (first > second) first else second

private fun <T> getMaxValue3(first: T, second: T) where T : Comparable<T> = if (first > second) first else second

private fun <T : Comparable<T>> getMaxValue(operand1: T, operand2: T): T? {
    if (operand1 == operand2) return null
    val identifier = operand1.compareTo(operand2)
    return if (identifier == 1) operand1
    else operand2
}

private fun <T : Comparable<T>> equalsCustom(operand1: T, operand2: T) = operand1 == operand2

private fun <T : Number> List<T>.getCustomSize() = size

private fun <T : Number> Number.getHalf() = toDouble() / 2

private fun <T : Number> getOneThird(value: T) = value.toDouble() / 3