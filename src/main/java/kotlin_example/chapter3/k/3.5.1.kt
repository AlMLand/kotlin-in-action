package kotlin_example.chapter3.k

fun main() {
    println("23.3232-sd.id".split(".", "-"))
    println("23.3232-sd.id".split("""[.\-]""".toRegex()))
}