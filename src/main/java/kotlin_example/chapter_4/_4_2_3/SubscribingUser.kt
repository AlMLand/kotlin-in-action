package kotlin_example.chapter_4._4_2_3

private class SubscribingUser(override val email: String) : User


private const val USER_EMAIL = "testNickName@gmail.com"
private fun main() {
    println(SubscribingUser(USER_EMAIL).nickName)
}
