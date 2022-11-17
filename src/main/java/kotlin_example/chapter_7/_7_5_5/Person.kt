package kotlin_example.chapter_7._7_5_5

class Person {
    private val _attributes = HashMap<String, String>()
    fun setAttributes(key: String, value: String) {
        _attributes[key] = value
    }

    val name: String
        get() = _attributes["name"]!!
    val company: String
        get() = _attributes["company"]!!
}