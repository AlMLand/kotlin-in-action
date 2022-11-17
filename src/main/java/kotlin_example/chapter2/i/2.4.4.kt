package kotlin_example.chapter2.i

fun main(){
    println(isLetter('9'))
    println(isNotDigit('1'))
    println(checkChar('1'))
    println("asks" in "i ask you")
    println("Kotlin" in "Java".."Scala")
    println("a" in setOf("k", "l", "d", "a"))
    println("a" in mapOf(Pair("a", "1"), Pair("b", "2")))
}

fun checkChar(c: Char) =
    when (c) {
        in '0'..'9' -> "It is a digit"
        in 'a'..'z', in 'A'..'Z' -> "It is a letter"
        else -> "I don't know"
    }
fun isLetter(char: Char) = char in 'a'..'z' || char in 'A'..'Z'
fun isNotDigit(char: Char) = char !in '0'..'9'