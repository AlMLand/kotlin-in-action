package kotlin_example.chapter_6._6_2_1

private fun main() {
    cI(146)
}

private fun cI(number: Int) {
    val i = number.coerceIn(0, 100)
    println("We are $i% done!")
}