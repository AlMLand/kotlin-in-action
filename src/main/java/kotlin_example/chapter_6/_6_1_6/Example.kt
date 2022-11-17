package kotlin_example.chapter_6._6_1_6

private fun main() {
    println(ignoreNullValue("T"))
    println(ignoreNullValue(null))
}

private fun ignoreNullValue(s: String?): Int {
    //val sNotNull = s!!
    //return sNotNull.length
    return s!!.length
}