package kotlin_example.chapter_4._4_4_3

private data class Person(private val name: String) {
    companion object Loader {
        fun fromJson(jsonText: String): Person {
            if (jsonText.contains("name:")) {
                val name = jsonText.substringAfter("'").substringBefore("'")
                if (name.isNotBlank()) {
                    return Person(name)
                }
            }
            throw IllegalArgumentException("The json is not valid: $jsonText")
        }
    }
}


private fun main() {
    val json = "{name: 'Alex'}"
    val person = Person.fromJson(json)
    println(person)
}