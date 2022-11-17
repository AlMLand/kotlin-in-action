package kotlin_example.chapter_7._7_5_5

class Person2 {
    private val _attributes = HashMap<String, String>()
    fun setAttributes(key: String, value: String) {
        _attributes[key] = value
    }

    val firstName: String by _attributes
    val lastName: String by _attributes
    val age: String by _attributes
}