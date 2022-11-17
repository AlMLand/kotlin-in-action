package kotlin_example.chapter_4_repeat._4_2_1

private class User2() {
    var nickName: String? = null

    constructor(nickName: String?) : this() {
        this.nickName = nickName
    }

    override fun toString(): String = "user2(nickname=$nickName)"
}

fun main() {
    val u = User2("T")
    println(u)
    val uNull = User2()
    println(uNull)
}