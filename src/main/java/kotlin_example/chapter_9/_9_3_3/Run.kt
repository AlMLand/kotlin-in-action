package kotlin_example.chapter_9._9_3_3

fun main() {
    val cats = Herd(leadAnimal = Cat("lead"), animals = arrayOf(Cat("A"), Cat("B")))
    takeCareOfCats(cats)
}