package kotlin_example.chapter_4_repeat._4_2_1

private data class User private constructor(val nickName: String) {
    constructor(nick: String, name: String) : this(nick.plus(name))
}


fun main() {
    val user = User("start", "end")
    println(user)
}