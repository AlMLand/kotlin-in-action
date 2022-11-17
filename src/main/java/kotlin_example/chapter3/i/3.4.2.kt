package kotlin_example.chapter3.i

fun main() {
    println(getList(getArrayStrings()))
    println(getList(getArrayStrings()).size)

    println(getList(getArrayInt()))
    println(getList(getArrayInt()).size)
}

fun getArrayStrings() = arrayOf("a", "bb", "ccc")
fun getArrayInt() = arrayOf(1, 2, 3)

fun <T> getList(array: Array<T>) = listOf("array: ", *array)
