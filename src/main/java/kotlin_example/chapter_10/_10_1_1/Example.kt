package kotlin_example.chapter_10._10_1_1

fun main() {
    removeCustom(1)
}

@Deprecated(message = "user ... instead", replaceWith = ReplaceWith("method name"), level = DeprecationLevel.WARNING)
private fun removeCustom(index: Int) {
}
