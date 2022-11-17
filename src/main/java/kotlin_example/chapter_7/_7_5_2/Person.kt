package kotlin_example.chapter_7._7_5_2

data class Person(override val name: String) : People() {
    private var _emails: List<Email>? = null
    override val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this)
            }
            return _emails!!
        }
}