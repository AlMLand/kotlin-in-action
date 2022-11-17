package kotlin_example.chapter_4_repeat._4_3_3

fun main() {
    val dck = DelegationCollectionKotlin<String>()
    dck.addAll(arrayListOf("A", "B", "C"))
    println(dck.size)
}