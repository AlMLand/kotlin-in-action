package kotlin_example.chapter_7._7_5_5

private fun main() {
    val t = Person()
    val data = mapOf("name" to "T", "company" to "Amazon")
    data.forEach { (key, value) -> t.setAttributes(key, value) }
    println(t.name)
    println(t.company)
}