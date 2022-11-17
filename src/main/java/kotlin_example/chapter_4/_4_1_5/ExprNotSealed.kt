package kotlin_example.chapter_4._4_1_5

interface Expr
class Num(val num: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.num
        is Sum -> eval(expr.left) + eval(expr.right)
        else -> throw IllegalArgumentException("The value [$expr] is incorrect")
    }
