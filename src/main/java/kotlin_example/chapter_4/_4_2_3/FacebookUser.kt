package kotlin_example.chapter_4._4_2_3

private class FacebookUser(private val accountId: String, override val email: String) : User {
    override val nickName = getFacebookName(accountId)

    private fun getFacebookName(accountId: String) = accountId.substring(4)
}

private const val ACCOUNT_ID = "2017Tumur"
private const val USER_EMAIL = "testEmail@gmail.com"
private fun main() {
    println(FacebookUser(ACCOUNT_ID, USER_EMAIL).nickName)
}
