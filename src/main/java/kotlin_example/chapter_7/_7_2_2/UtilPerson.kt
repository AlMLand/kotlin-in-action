package kotlin_example.chapter_7._7_2_2

operator fun Person.get(index: Int): String {
    return when (index) {
        0 -> firstName
        1 -> lastName
        else -> throw IndexOutOfBoundsException("index $index is not id the range")
    }
}

operator fun Person.set(index: Int, value: String) {
    when (index) {
        0 -> firstName = value
        1 -> lastName = value
        else -> throw IndexOutOfBoundsException("index $index is not id the range")
    }
}