package kotlin_example.chapter2.f


interface Expression

class Num(val number: Int): Expression

class Sum(val exprLeft: Expression, val exprRight: Expression): Expression


// (1 + 2) + 4
//           sum
//      sum      num
//   num    num
fun main(){
    println(evalWithIf(Sum(Sum(Num(1), Num(2)), Num(4))))
    //println(evalWithWhen(Sum(Sum(Num(1), Num(2)), Num(4))))
}

fun evalWithWhen(e: Expression): Int =
    when(e){
        is Num -> {
            val n = e.number
            println("num: $n")
            n
        }
        is Sum -> {
            val l = evalWithWhen(e.exprLeft)
            val r = evalWithWhen(e.exprRight)
            println("sum: $l + $r")
            l + r
        }
        else -> throw IllegalArgumentException("unknown exception")
    }

fun evalWithIf(e: Expression): Int =
    if(e is Num) {
        val n = e.number
        println("num: $n")
        n
    } else if(e is Sum) {
        val l = evalWithIf(e.exprLeft)
        val r = evalWithIf(e.exprRight)
        println("sum: $l + $r")
        l + r
    } else {
        throw IllegalArgumentException("unknown expression")
    }
