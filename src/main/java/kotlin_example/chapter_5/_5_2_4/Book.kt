package kotlin_example.chapter_5._5_2_4

private data class Book(val title: String, val authors: List<String>)


private fun main() {
    val books = listOf(
        Book("aBook", listOf("aAuthor", "bAuthor", "cAuthor")),
        Book("bBook", listOf("cAuthor", "dAuthor")),
        Book("cBook", listOf("dAuthor", "eAuthor", "fAuthor"))
    )

    val authors = books
        .asSequence()
        .flatMap { it.authors }
        .distinct()
        .toList()
    //val authors = books.asSequence().flatMap { it.authors }.toSet()
    println(authors)


    val listWords = listOf(
        listOf("c", "d", "p"),
        listOf("e", "j", "n"),
        listOf("x", "b", "z")
    )
    println(listWords)

    val wordsFlatList = listWords
        .asSequence()
        .flatten()
        .sorted()
        .toList()
    println(wordsFlatList)
}