package kotlin_example.chapter_9._9_3_6.test

import kotlin.reflect.KClass

fun main() {
    val validators = initFieldValidatorStorage()

    // error
    // validators[String::class].validate("d")
    // warning and error
    // val stringValidator = validators[Int::class] as FieldValidator<String>
    // warning
    val stringValidator = validators[String::class] as FieldValidator<String>
    //val stringValidator = validators[String::class] as FieldValidator.StringFieldValidator
    println(stringValidator.validate(""))
}

private fun initFieldValidatorStorage(): MutableMap<KClass<*>, FieldValidator<*>> {
    val fieldValidator = mutableMapOf<KClass<*>, FieldValidator<*>>()
    fieldValidator[String::class] = FieldValidator.StringFieldValidator
    fieldValidator[Int::class] = FieldValidator.IntFieldValidator
    return fieldValidator
}