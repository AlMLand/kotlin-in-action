package kotlin_example.chapter2.b

fun main(args: Array<String>){
    val name = if(args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name")
    println("All power of \$$name")

    if(args.isNotEmpty()) println("Hello, ${args[0]}") else println("Hello, KOtlin")
    println("Hello, ${if(args.isNotEmpty()) args[0] else "KOTLIN"}")
}