package kotlin_example.chapter_4._4_2_4

private class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
                Address was changed for $name: 
                $field -> $value.
            """.trimIndent()
            )
            field = value
        }
        get() {
            println(
                """
                Address for $name was get: $field
            """.trimIndent()
            )
            return field
        }
}


private fun main() {
    val t = User("T")
    // prisvaivanie vizovet za kulisami method set(value)
    t.address = "El Straße 1, 11111 Dresden"
    t.address
}
