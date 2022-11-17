package kotlin_example.chapter_7._7_4_1

private fun main() {
    val map = mapOf(1 to "A", 2 to "B", 3 to "C")
    printEntries(map)
    println()
    printEntries2(map)
}

private fun <T, V> printEntries(source: Map<T, V>) {
    for ((key, value) in source) {
        println("the key: $key | the value: $value")
    }
}

private fun <T, V> printEntries2(source: Map<T, V>) =
    source.forEach { (key, value) -> println("the key: $key | the value: $value") }
