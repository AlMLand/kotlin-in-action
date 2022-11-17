package kotlin_example.chapter_4_repeat._4_2_3.test

class PrivateUser(override val fullName: String) : User {
    override fun toString(): String {
        return "PrivateUser(fullName=$fullName, nickName=$nickName)"
    }
}