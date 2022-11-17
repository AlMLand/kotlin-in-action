package kotlin_example.chapter_7._7_4

// by data classes:
//data class FileNameComponent(val name: String, val extension: String)

//or by not data classes:
class FileNameComponent(val name: String, val extension: String, val actual: Boolean = true) {
    operator fun component1() = name
    operator fun component2() = extension
}

private fun resolveFileName(fileName: String): FileNameComponent {
    val (incomingFileName, incomingFileExtension) = fileName.split(".", limit = 2)
    return FileNameComponent(incomingFileName, incomingFileExtension)
}


private fun main() {
    val (myFileName, myExtension) = resolveFileName("T.word")
    println("$myFileName | $myExtension")
    //println("$myFileName | ")
}