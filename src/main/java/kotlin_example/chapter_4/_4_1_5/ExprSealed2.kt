package kotlin_example.chapter_4._4_1_5

sealed interface ExprSealed2 {
    class Num(val num: Int) : ExprSealed2 {
        override fun printLetter() = println("A")
    }

    class Sum(val left: ExprSealed2, val right: ExprSealed2) : ExprSealed2 {
        override fun printLetter() = println("B")
    }

    fun printLetter()
}

fun eval(expr: ExprSealed2): Int =
    when (expr) {
        is ExprSealed2.Num -> expr.num
        is ExprSealed2.Sum -> eval(expr.left) + eval(expr.right)
    }