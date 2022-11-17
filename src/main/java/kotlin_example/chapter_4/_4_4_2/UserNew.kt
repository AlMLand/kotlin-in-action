package kotlin_example.chapter_4._4_4_2

private data class UserNew private constructor(private val nickName: String) : Comparable<UserNew> {
    companion object {
        fun getSubscribingUser(email: String) = UserNew(email.substringBefore("@"))
        fun getFacebookUser(accountId: Int) = UserNew("facebookName$accountId")
    }

    object UserNewComparator : Comparator<UserNew> {
        override fun compare(o1: UserNew?, o2: UserNew?): Int {
            return if (o1 == null && o2 == null) 0
            else if (o1 == null) -1
            else if (o2 == null) 1
            else o1.nickName.compareTo(o2.nickName)
        }
    }

    override fun compareTo(other: UserNew): Int = this.nickName.compareTo(other.nickName)
}


private fun main() {
    val u1 = UserNew.getSubscribingUser("test@gmail.com")
    println(u1)
    val u2 = UserNew.getFacebookUser(1)
    println(u2)

    val sortedSet = sortedSetOf(UserNew.UserNewComparator, u1, u2)
    println(sortedSet)
}
