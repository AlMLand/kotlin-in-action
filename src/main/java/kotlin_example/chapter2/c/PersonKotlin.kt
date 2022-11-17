package kotlin_example.chapter2.c

class PersonKotlin(
    val name: String,
    var isMarried: Boolean) : SharedI {

    override fun toString() = "PersonKotlin(name='$name', isMarried=$isMarried)"
    override fun getFullInfo() = "fullInfoKotlin"
}