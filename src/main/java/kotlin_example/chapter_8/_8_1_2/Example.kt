package kotlin_example.chapter_8._8_1_2

private fun main() {
    println(sumFunction(5, 10))

    twoAndFour { a, b -> a + b }
    twoAndFour { a, b -> a * b }


    // tri vida zapisi
    println(twoAndFive(sumFunction))
    println(twoAndFive({ a, b -> a + b }))
    // to zhe samoe, chto i swerhu prosto lambda argument winesen za skobki
    println(twoAndFive { a, b -> a * b })

    val t = "Ti"
    println(t.filter { x -> x.isUpperCase() })

    println("custom values: ${customIntValues(10, 4) { x, y -> x * y }}")
    println("custom values: ${customIntValues(40, 2)}")
}

private fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    // for (element in this) {
    // or
    for (index in 0 until this.length) {
        // val element = this.get(index)
        // or
        // val element = get(index)
        // or
        val element = this[index]
        if (predicate(element))
            sb.append(element)
    }
    return sb.toString()
}

private val sumFunction: (Int, Int) -> Int = { a, b -> a + b }

private fun twoAndFour(sumFunction: (Int, Int) -> Int) {
    val result = sumFunction(2, 4)
    println("the result is $result")
}

private fun twoAndFive(sumFunction: (Int, Int) -> Int) = sumFunction(2, 5)

private fun customIntValues(
    operand1: Int,
    operand2: Int,
    sumFunction: (Int, Int) -> Int = { x, y -> x + y }
) =
    sumFunction(operand1, operand2)