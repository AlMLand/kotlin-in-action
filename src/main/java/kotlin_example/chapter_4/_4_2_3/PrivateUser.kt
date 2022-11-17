package kotlin_example.chapter_4._4_2_3

private class PrivateUser(override val nickName: String, override val email: String = "defaultEmail") : User


private fun main() {
    println(PrivateUser("T").nickName)
}
