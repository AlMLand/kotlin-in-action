package kotlin_example.chapter2.g

val count: Int = 10

fun main(){
    progressFor3()
}

fun progressFor1() {
    for (i in 1..100) {
        println(fizzBuzz(i))
    }
}

fun progressFor2() {
    for(i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }
}

fun progressFor3() {
    for(i in 0 until listOf(11, 22, 33, 44, 55).size) {
        println(fizzBuzz(i))
    }
}

fun fizzBuzz(i: Int) =
    when {
        i % 3 == 0 && i % 5 == 0 -> "fizz buzz: $i"
        i % 3 == 0 -> "fizz: $i"
        i % 5 == 0 -> "buzz: $i"
        else -> "$i"
    }
