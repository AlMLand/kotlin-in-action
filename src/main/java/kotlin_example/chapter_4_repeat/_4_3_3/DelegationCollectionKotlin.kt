package kotlin_example.chapter_4_repeat._4_3_3

class DelegationCollectionKotlin<T>(
    private val arrayList: MutableCollection<T> = ArrayList()
) : MutableCollection<T> by arrayList {
    override val size: Int
        get() = arrayList.size + 10
}