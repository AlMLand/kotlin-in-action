package kotlin_example.chapter3.j

val map = mapOf(1 to "one", 7.to("seven"), 53 to "fifty-three")

fun main() {
    val (number, name) = 4 to "four"
    println(number)
    println(name)

    for ((key, value) in map)
        println("This is my key: $key, value: $value")
}
