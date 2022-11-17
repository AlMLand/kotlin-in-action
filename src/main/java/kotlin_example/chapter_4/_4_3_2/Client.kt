package kotlin_example.chapter_4._4_3_2

private data class Client(private val name: String, private val postalCode: String)


private fun main() {
    val client1 = Client("T", "01307")
    val client2 = Client("T", "01307")
    val map = hashSetOf(client1)

    println(map.contains(client1))
    println(map.contains(client2))
    println(client1)

    val client3 = client1.copy(name = "E")
    println(client3)
    println(client1 == client3)
    println(client1 === client3)
}
