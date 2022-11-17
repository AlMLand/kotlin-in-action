package kotlin_example.chapter_6._6_1_7

private fun main() {
    val email: String? = "test@gmail.com"
    val emailNull: String? = null

    if (email != null) sendEmail(email)
    email?.let { sendEmail(it) }
    emailNull?.let { sendEmail(it) } ?: println("not available")
}

private fun sendEmail(email: String) = println(email)
