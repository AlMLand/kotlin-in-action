package kotlin_example.chapter_5._5_1_4

private fun main() {
    val prefix = "Error:"
    val collection = listOf("403 Forbidden", "404 Not Found", "500 Internal Server Error")
    setPrefixAndPrint(collection, prefix)
    printProblemCounts(collection)
}

private fun <T> printProblemCounts(collection: Collection<T>) {
    var clientError = 0
    var serverError = 0
    collection.forEach {
        if (it is String) {
            if (it.startsWith("4"))
                clientError++
            if (it.startsWith("5"))
                serverError++
        }
    }
    println("client errors: $clientError\nserver errors: $serverError")
}

private fun <T> setPrefixAndPrint(collection: Collection<T>, prefix: String) =
    collection.forEach { println("$prefix $it") }