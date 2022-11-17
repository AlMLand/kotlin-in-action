package kotlin_example.chapter_6._6_3_2

private fun main() {
    val col: Collection<Int?> = arrayListOf(1, 2, null, 4)
    val mutCol: MutableCollection<Int?> = arrayListOf<Int?>()

    copyElements(col, mutCol)
    println(mutCol)


    val l = arrayListOf("a", "b", "c")
    val coll: List<String> = l
    val mutColl: MutableList<String> = l
}

private fun <T> copyElements(collection: Collection<T>, mutableCollection: MutableCollection<T>) =
    collection.forEach { mutableCollection.add(it) }