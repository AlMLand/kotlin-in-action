package kotlin_example.chapter_4._4_4_3_2

data class Vehicle(private val name: String) {
    companion object : JsonFactory<Vehicle> {
        override fun fromJson(jsonText: String): Vehicle {
            if (jsonText.contains("name:")) {
                val name = jsonText.substringAfter("'").substringBefore("'")
                if (name.isNotBlank()) {
                    return Vehicle(name)
                }
            }
            throw IllegalArgumentException("The json is not valid: $jsonText")
        }
    }
}
