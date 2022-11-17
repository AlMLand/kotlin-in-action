package kotlin_example.chapter3.g

fun main() {
    ex1 = "Java".lastCharString
    println(ex1)

    var sb = StringBuilder("Kotlin?")
    sb.changeLastChar = '!'
    println(sb)
}

var ex1: Char? = null
val ex2: Char? = null

val String.lastCharString: Char
    get() = get(length - 1)

val String.lastCharString2: Char
    get() = this[length - 1]

var StringBuilder.changeLastChar: Char
    get() = get(length - 1)
    set(value) = setCharAt(length - 1, value)
