package kotlin_example.chapter_4_repeat._4_2_3.test

interface User {
    val fullName: String
    val nickName: String
        get() = fullName.substringBefore(',')
}