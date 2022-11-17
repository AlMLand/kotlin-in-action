package kotlin_example.chapter_4._4_4_3_2


private fun main() {
    val jsonPerson = "{name: 'T'}"
    val person = JsonLoader.loadFromJson(Person, jsonPerson)
    println(person)

    val jsonVehicle = "{name: 'Mercedes'}"
    val vehicle = JsonLoader.loadFromJson(Vehicle, jsonVehicle)
    println(vehicle)
}