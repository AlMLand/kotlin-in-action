package kotlin_example.chapter3

fun main() {
    println(getPath(path))
}

val path = "*/Users/yole/kotlin-book/chapter.adoc"

private fun getPath(path: String): String {
    val dir = path.substringBeforeLast("/")
    val fileName = path.substringAfterLast("/").substringBefore(".")
    val extension = path.substringAfterLast(".")
    return "Dir: $dir; file name: $fileName; file extension: $extension"
}