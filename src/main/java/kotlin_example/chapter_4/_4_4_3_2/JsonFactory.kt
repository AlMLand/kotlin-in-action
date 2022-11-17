package kotlin_example.chapter_4._4_4_3_2

interface JsonFactory<T> {
    fun fromJson(jsonText: String): T
}