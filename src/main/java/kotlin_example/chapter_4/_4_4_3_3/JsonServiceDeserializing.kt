package kotlin_example.chapter_4._4_4_3_3

object JsonServiceDeserializing {
    fun Person.Companion.fromJson(jsonText: String): Person {
        if (jsonText.contains("name:")) {
            val name = jsonText.substringAfter("'").substringBefore("'")
            if (name.isNotBlank()) {
                return Person(name)
            }
        }
        throw IllegalArgumentException("The json is not valid: $jsonText")
    }

    fun Vehicle.Companion.fromJson(jsonText: String): Vehicle {
        if (jsonText.contains("name:")) {
            val name = jsonText.substringAfter("'").substringBefore("'")
            if (name.isNotBlank()) {
                return Vehicle(name)
            }
        }
        throw IllegalArgumentException("The json is not valid: $jsonText")
    }
}