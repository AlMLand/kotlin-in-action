package kotlin_example.chapter_9._9_3_5

fun main() {
    val fullList = mutableListOf(1, 2, 3)
    val emptyList = mutableListOf<Any>()
    copyData4(fullList, emptyList)
    println(emptyList)
}

//                                      to zhe samoe chot v java:     ? super T
private fun <T> copyData4(source: MutableList<T>, target: MutableList<in T>) = source.forEach { target.add(it) }

//             to zhe samoe chot v java:     ? extends T
private fun <T> copyData3(source: MutableList<out T>, target: MutableList<T>) = source.forEach { target.add(it) }

private fun <T : R, R> copyData2(source: MutableList<T>, target: MutableList<R>) = source.forEach { target.add(it) }

private fun <T> copyData(source: MutableList<T>, target: MutableList<T>) = source.forEach { target.add(it) }

