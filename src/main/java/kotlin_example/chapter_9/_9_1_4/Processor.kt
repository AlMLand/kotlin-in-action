package kotlin_example.chapter_9._9_1_4

private class Processor<T : Any> {
    fun process(value: T) = value.hashCode()
}


fun main() {
    val pr = Processor<String>()
    println(pr.process("aw"))
}