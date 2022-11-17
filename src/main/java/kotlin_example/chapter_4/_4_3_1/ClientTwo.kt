package kotlin_example.chapter_4._4_3_1

private class ClientTwo(private val name: String, private val postalCode: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ClientTwo

        if (name != other.name) return false
        if (postalCode != other.postalCode) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postalCode.hashCode()
        return result
    }

}


private fun main() {
    val client1 = ClientTwo("T", "01307")
    val client2 = ClientTwo("T", "01307")
    val map = hashSetOf(client1)

    println(map.contains(client1))
    println(map.contains(client2))
}