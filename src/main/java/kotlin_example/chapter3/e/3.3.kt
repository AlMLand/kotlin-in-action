package kotlin_example.chapter3.e

fun main() {
    println("Kotlin".lastChar1())
    val pr = 12
    println(pr.multipleToHundret())
}

// odin i tot zhe mehtod v 5 variacijah (this mozhno opuskat)
fun String.lastChar() = get(length - 1)

fun String.lastChar1() = this[this.length - 1]

fun String.lastChar2() = this.get(this.length - 1)

private fun String.lastChar3(): Char = this.get(this.length - 1)

fun String.lastChar4(): Char {
    return this.get(this.length - 1)
}


fun Int.multipleToHundret() = this * 100