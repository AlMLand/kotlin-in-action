package kotlin_example.chapter_4._4_4_3_3

import kotlin_example.chapter_4._4_4_3_3.JsonServiceDeserializing.fromJson

private fun main() {
    val jsonPerson = "{name: 'T'}"
    val person = Person.fromJson(jsonPerson)
    println(person)

    val jsonVehicle = "{name: 'Mercedes'}"
    val vehicle = Vehicle.fromJson(jsonVehicle)
    println(vehicle)
}