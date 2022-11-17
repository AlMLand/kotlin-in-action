package kotlin_example.chapter_4._4_4_3_2

object JsonLoader {
    fun <T> loadFromJson(factory: JsonFactory<T>, json: String) = factory.fromJson(json)
}