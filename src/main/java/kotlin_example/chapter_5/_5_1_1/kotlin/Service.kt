package kotlin_example.chapter_5._5_1_1.kotlin

class Service {
    fun actionWithLambda(button: Button) = button.setOnClickListener { println("huhu") }
}