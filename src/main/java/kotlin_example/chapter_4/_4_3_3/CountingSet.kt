package kotlin_example.chapter_4._4_3_3

private class CountingSet<T>(private val innerSet: MutableCollection<T> = HashSet()) :
    MutableCollection<T> by innerSet {
    var count = 0

    override fun add(element: T): Boolean {
        return if (innerSet.add(element)) {
            count++
            true
        } else
            false
    }

    override fun addAll(elements: Collection<T>): Boolean {
        return if (innerSet.addAll(elements)) {
            count += elements.size
            true
        } else
            false
    }

    override fun remove(element: T): Boolean {
        return if (innerSet.remove(element)) {
            count--
            true
        } else
            false
    }

    override fun removeAll(elements: Collection<T>): Boolean {
        return if (innerSet.removeAll(elements.toSet())) {
            count -= elements.size
            true
        } else
            false
    }
}


private fun main() {
    val c = CountingSet(HashSet<Int>())
    c.addAll(hashSetOf(1, 2, 3, 3))
    c.add(4)
    c.add(4)
    println(c.count)

    c.remove(3)
    c.removeAll(hashSetOf(1, 4))
    println(c.count)
}