package kotlin_example.chapter2.b

fun main(){
    println(maxValue(5, 2))
    println(setText())
}

fun maxValue(a: Int, b: Int) = if (a > b) a else b

val question = "What is your name?"
val count = 42
val myDouble = 4.222

fun rt() = true

fun setText(): String{
    val text: String
    if(rt()){
        text = "succsess"
    } else{
        text = "fail"
    }
    return text
}
