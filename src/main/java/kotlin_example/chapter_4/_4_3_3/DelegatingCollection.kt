package kotlin_example.chapter_4._4_3_3

private class DelegatingCollection<T> : Collection<T> {
    private val innerList = arrayListOf<T>()

    override val size: Int get() = innerList.size
    override fun isEmpty() = innerList.isEmpty()
    override fun iterator() = innerList.iterator()
    override fun containsAll(elements: Collection<T>) = innerList.containsAll(elements)
    override fun contains(element: T) = innerList.contains(element)
}