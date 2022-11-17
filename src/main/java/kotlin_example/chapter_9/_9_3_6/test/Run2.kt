package kotlin_example.chapter_9._9_3_6.test

fun main() {
    initValidators()
    initValidator()
    val stringValidator = Validator[String::class]
    println(stringValidator.validate("alex"))
}

private fun initValidator() {
    Validator.registerValidator(Pair(Double::class, FieldValidator.DoubleFieldValidator))
}

private fun initValidators() {
    Validator.registerAllValidators(
        Pair(String::class, FieldValidator.StringFieldValidator),
        Pair(Int::class, FieldValidator.IntFieldValidator)
    )
}