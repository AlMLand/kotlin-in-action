package kotlin_example.chapter_9._9_3_3

class Cat(val name: String) : Animal() {
    fun cleanLitter() = println("cat clean litter")
    override fun feel() = println("$name feel")
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (index in 0 until cats.size) {
        val cat = cats[index]
        cat.cleanLitter()
    }
    feedAll(cats)
}
