package kotlin_example.chapter3

fun main () {
    println("$hSet | ${hSet.javaClass}")
    println("$list | ${list.javaClass}")
    println("$map | ${map.javaClass}")
    println(l.max())
    println("[${l.first()}] | [${l.last()}]")
    println(set.size)
}

val set = setOf(1, 1, 3, 3, 5, 5, 4, 4)
val l = listOf("a", "b", "c", "d", "e")
val hSet = hashSetOf(1, 3, 23)
val list = arrayListOf(1, 2, 1, 4)
val map = hashMapOf("a" to 11, "b" to 22, "c" to 33)

