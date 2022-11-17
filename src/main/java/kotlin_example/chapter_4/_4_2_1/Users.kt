package kotlin_example.chapter_4._4_2_1

fun main() {
    val user = User4()
    println(user.name)
    println(user.bool)

    val user2 = User4(bool = false)
    println(user2.name)
    println(user2.bool)

    println("User6= " + User6())
}

class User6

class User5()

class User4(val name: String = "T", val bool: Boolean = true)

class User3(val name: String)

class User2(name: String) {
    val name = name
}

class User1 constructor(name: String) {
    val name: String

    init {
        this.name = name
    }
}
