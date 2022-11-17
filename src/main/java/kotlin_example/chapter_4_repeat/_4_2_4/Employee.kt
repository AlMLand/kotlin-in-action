package kotlin_example.chapter_4_repeat._4_2_4

data class Employee(private val firsName: String, private val lastName: String) {
    var age: Int? = null
        set(newAge) {
            val oldAge = field
            field = newAge
            println("${this.toString()} has new age: $newAge, old age: $oldAge")
        }

    var address: Address? = null
        set(newAddress) {
            val oldAddress = field
            field = newAddress
            println("${this.toString()} has new address: $newAddress, old age: $oldAddress")
        }

    constructor(firsName: String, lastName: String, age: Int, address: Address) : this(firsName, lastName) {
        this.age = age
        this.address = address
    }

    override fun toString(): String {
        return """
            Employee(firsName=$firsName, lastName=$lastName, age=$age, address=$address)
        """.trimIndent()
    }
}