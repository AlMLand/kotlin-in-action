package kotlin_example.chapter3.h

fun main() {
    println(strings.max())
    println(strings.last())
    println(strings.last { t -> t != "ddddd" })
}

val strings = listOf("aa", "bbbbbb", "x", "cccc", "ddddd")

fun <T> List<T>.last() = this[size - 1]
