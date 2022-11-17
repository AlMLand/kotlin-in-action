package kotlin_example.chapter_4_repeat._4_2_3

fun main() {
    val privateUser = PrivateUser("T")
    println(privateUser.name)

    val subscribingUser = SubscribingUser("E")
    println(subscribingUser.name)
    println(subscribingUser.email)

    val twitterUser = TwitterUser()
    println(twitterUser.name)
    twitterUser.name = "Alex"
    println(twitterUser.name)
}