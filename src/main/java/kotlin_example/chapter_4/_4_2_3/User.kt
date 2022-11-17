package kotlin_example.chapter_4._4_2_3

interface User {
    val nickName: String
        get() = email.substringBefore("@")
    val email: String
}