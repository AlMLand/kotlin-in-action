package kotlin_example.chapter_4_repeat._4_2_1.test3.test

private const val DEFAULT_FIRST_NAME = "defaultFirstName"

private const val DEFAULT_AGE = 100

class User3(
    private val firstName: String,
    private val lastName: String,
    private var age: Int
) {

    constructor(f: String, l: String) : this(f, l, DEFAULT_AGE)

    constructor(l: String) : this(DEFAULT_FIRST_NAME, l, DEFAULT_AGE)

    override fun toString(): String = "User3(firstName=$firstName, lastName=$lastName, age=$age)"
}
