package kotlin_example.chapter_8._8_1_1

private fun main() {
    actionWithArgument(sum(4, 8))
    action()
    performRequest("http://t.com") { length, content -> println("the length: $length, the content: $content") }
    println(performRequest2("T") { it.length })
}

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
val action: () -> Unit = { println(message = 88) }
val actionWithArgument: (num: Int) -> Unit = { x: Int -> println(x) }
val canReturnNull: (Int, Int) -> Int? = { x, y -> null }
val funOrNull: ((x: Int) -> Int)? = null

private fun performRequest(url: String, callback: (code: Int, context: String) -> Unit) = callback(url.length, url)

private fun performRequest2(text: String, callback: (text: String) -> Int) = callback(text)
