package kotlin_example.chapter_9._9_3_6.test

import kotlin.reflect.KClass

sealed interface FieldValidator<in T> {
    fun validate(content: T): Boolean

    object StringFieldValidator : FieldValidator<String> {
        override fun validate(content: String): Boolean = content.isNotBlank()
    }

    object IntFieldValidator : FieldValidator<Int> {
        override fun validate(content: Int): Boolean = content >= 0
    }

    object DoubleFieldValidator : FieldValidator<Double> {
        override fun validate(content: Double): Boolean = content >= 0.0
    }
}

object Validator {
    private val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()

    fun <T : Any> registerValidator(pair: Pair<KClass<T>, FieldValidator<T>>) {
        validators[pair.first] = pair.second
    }

    fun registerAllValidators(vararg pair: Pair<KClass<*>, FieldValidator<*>>) {
        for (p in pair) validators[p.first] = p.second
    }

    @Suppress("UNCHECKED_CAST")
    operator fun <T : Any> get(clazz: KClass<T>): FieldValidator<T> =
        validators[clazz] as? FieldValidator<T> ?: throw IllegalArgumentException("the key $clazz are not present")
}
