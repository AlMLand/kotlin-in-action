package kotlin_example.chapter_4_repeat._4_3_3

class DelegationCollectionStandard<T> : Collection<T> {
    private val arrayList = arrayListOf<T>()
    override val size: Int
        get() = arrayList.size

    override fun isEmpty(): Boolean = arrayList.isEmpty()

    override fun iterator(): Iterator<T> = arrayList.iterator()

    override fun containsAll(elements: Collection<T>): Boolean = arrayList.containsAll(elements)

    override fun contains(element: T): Boolean = arrayList.contains(element)
}