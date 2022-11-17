package kotlin_example.chapter2.j

fun main(){
    println(perc(19))
}

fun perc(percentage: Int) =
    if (percentage !in 0..100) throw IllegalArgumentException("!!!!!!!") else "AAAAAAAAAA"
