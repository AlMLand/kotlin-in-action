package kotlin_example.chapter_8._8_3_2

private val persons = listOf(
    Person("A", 37),
    Person("E", 36),
    Person("T", 5)
)

private fun main() {
    getTestLocalReturn(persons)
    getTestLocalReturn2(persons)
}

private fun getTestLocalReturn2(persons: List<Person>) {
    var count = 0
    persons
        .forEach {
            count++
            val nameLength = 6
            if (it.name.length == nameLength)
                println("1 | count: $count")
            return@forEach
        }
    println(2)
}


private fun getTestLocalReturn(persons: List<Person>) {
    var count = 0
    persons
        .forEach label@{
            count++
            val nameLength = 6
            if (it.name.length == nameLength)
                println("1 | count: $count")
            return@label
        }
    println(2)
}
