package kotlin_example.chapter_4._4_4_2

private class UserOld {
    val nickName: String

    constructor(email: String) {
        this.nickName = email.substringBefore('@')
    }

    constructor(accountId: Int) {
        this.nickName = "facebookName$accountId"
    }

    override fun toString(): String {
        return super.toString()
    }
}


private fun main() {
    println(UserOld("test@gmail.com"))
    println(UserOld(1))
}