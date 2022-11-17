package kotlin_example.chapter_9._9_3_3

class Herd<out T : Animal>(private var leadAnimal: T, private vararg val animals: T) {
    val size: Int
        get() = animals.size

    operator fun get(index: Int): T = animals[index]
}

fun feedAll(animals: Herd<Animal>) {
    for (index in 0 until animals.size) {
        val animal = animals[index]
        animal.feel()
    }
}
