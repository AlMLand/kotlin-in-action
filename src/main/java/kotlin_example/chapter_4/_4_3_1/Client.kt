package kotlin_example.chapter_4._4_3_1

private class Client(private val name: String, private val postalCode: String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (postalCode != other.postalCode) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postalCode.hashCode()
        return result
    }

    override fun toString(): String {
        return "Client(name='$name', postalCode='$postalCode')"
    }
}


private fun main() {
    val client1 = Client("Tr", "01307")
    val client2 = Client("T", "01307")
    val client3 = client1
    // `==` kompiliruetsja v vizov method'a `equals`
    println("Equals: " + (client1 == client2))
    println("References in heap, with different objects: " + (client1 === client2))
    println("References in heap, with same object: " + (client1 === client3))
}