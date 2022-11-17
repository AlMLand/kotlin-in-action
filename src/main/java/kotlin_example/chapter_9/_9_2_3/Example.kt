package kotlin_example.chapter_9._9_2_3

import kotlin_example.chapter_5._5_1_1.kotlin.Service
import java.util.*

fun main() {
    val serviceImpl = ServiceLoader.load(Service::class.java)
    loadClass<Service>()
}

private inline fun <reified T> loadClass() = ServiceLoader.load(T::class.java)