package kotlin_example.chapter_4._4_4_3_2

data class Person(private val name: String) {
    companion object : JsonFactory<Person> {
        override fun fromJson(jsonText: String): Person {
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
