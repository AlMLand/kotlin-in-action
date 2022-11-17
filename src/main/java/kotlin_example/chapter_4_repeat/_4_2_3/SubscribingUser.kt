package kotlin_example.chapter_4_repeat._4_2_3

class SubscribingUser(val email: String) : User {
    override val name: String
        get() = email.substring(3)
}