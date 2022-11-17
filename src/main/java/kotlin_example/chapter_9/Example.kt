package kotlin_example.chapter_9

private val map1 = mapOf('a' to "AA")
private val map2 = mapOf(Pair('b', "BB"))
private val map3 = mapOf(Pair<Char, String>('c', "CC"))
private val map4 = mutableMapOf<Char, String>()
private val list1 = listOf('a', 'b', 'c', 'd')

private fun main() {
    map1.forEach { (key, value) -> println("this is key: $key | this is value: $value") }
    map2.forEach { (key, value) -> println("this is key: $key | this is value: $value") }
    map3.forEach { (key, value) -> println("this is key: $key | this is value: $value") }

    val listAfterSlice = list1.slice(1..2)
    println(listAfterSlice)
    println(listAfterSlice.myOwnProperty)
}

private val <T> List<T>.myOwnProperty: Int
    get() = size