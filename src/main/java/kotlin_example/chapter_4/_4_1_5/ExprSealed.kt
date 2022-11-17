package kotlin_example.chapter_4._4_1_5

sealed class ExprSealed {
    class Num(val num: Int) : ExprSealed() {
        override fun printLetter() = println("a")
    }

    class Sum(val left: ExprSealed, val right: ExprSealed) : ExprSealed() {
        override fun printLetter() = println("b")
    }

    abstract fun printLetter()
}

fun eval(exprSealed: ExprSealed): Int =
    when (exprSealed) {
        is ExprSealed.Num -> exprSealed.num
        is ExprSealed.Sum -> eval(exprSealed.left) + eval(exprSealed.right)
    }