package kotlin_example.chapter_4._4_3_3

private class DelegetingCollection<T>(
    val innerList: Collection<T> = ArrayList()
) : Collection<T> by innerList


private fun main() {
    val dc = DelegetingCollection(arrayListOf(1, 2, 3))

    println(dc.size)
    println(dc.contains(2))

    val l = dc.innerList
    println(l)
}