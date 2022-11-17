package kotlin_example.chapter_7._7_5_2

class BetterPerson(override val name: String) : People() {
    override val emails by lazy { loadEmails(this) }
}