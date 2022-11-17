package kotlin_example.chapter3.n

fun main() {
    val pr = Person(1, "test", "test")
    println(pr.savePerson5(Person(2, "AA", "")))
}

class Person(
    private val id: Int,
    private val name: String,
    private val address: String
) {

    fun savePerson5(person: Person) {
        fun Person.validateBeforeSave() {
            fun <T> validate(value: T, fieldName: String) =
                when (value) {
                    is String -> if (value.isBlank())
                        throw IllegalArgumentException("Can't save the person, [$fieldName] is null") else ""

                    is Int -> if (value == 0)
                        throw IllegalArgumentException("Can't save the person, [$fieldName] is null") else ""

                    else -> throw IllegalArgumentException("Can't save the person, [$fieldName] has not allowed type")
                }
            validate(id, "Id")
            validate(name, "Name")
            validate(address, "Address")
        }
        person.validateBeforeSave()
        // ...
    }

    // to savePerson4()
    private fun Person.validateBeforeSave() {
        fun <T> validate(value: T, fieldName: String) =
            when (value) {
                is String -> if (value.isBlank())
                    throw IllegalArgumentException("Can't save the person, [$fieldName] is null") else ""

                is Int -> if (value == 0)
                    throw IllegalArgumentException("Can't save the person, [$fieldName] is null") else ""

                else -> throw IllegalArgumentException("Can't save the person, [$fieldName] has not allowed type")
            }
        validate(id, "Id")
        validate(name, "Name")
        validate(address, "Address")
    }

    fun savePerson4(person: Person) {
        person.validateBeforeSave()
        // ...
    }

    fun savePerson3(person: Person) {
        fun <T> validate(
            value: T,
            fieldName: String
        ) {
            when (value) {
                is String -> if (value.isBlank())
                    throw IllegalArgumentException("Can't save the person, [$fieldName] is null")

                is Int -> if (value == 0)
                    throw IllegalArgumentException("Can't save the person, [$fieldName] is null")
            }
        }
        validate(person.id, "Id")
        validate(person.name, "Name")
        validate(person.address, "Address")
        // ...
    }

    fun savePerson2(person: Person) {
        fun <T> validate(
            person: Person,
            value: T,
            fieldName: String
        ) {
            when {
                value is String -> if (value.isBlank())
                    throw IllegalArgumentException("Can't save the person, [$fieldName] is null")

                value is Int -> if (value == 0)
                    throw IllegalArgumentException("Can't save the person, [$fieldName] is null")
            }
        }
        validate(person, person.id, "Id")
        validate(person, person.name, "Name")
        validate(person, person.address, "Address")
        // ...
    }

    fun savePerson1(person: Person) {
        if (person.id == 0) {
            throw IllegalArgumentException("Can't save the person id: [${person.id}] is null")
        }
        if (person.name.isBlank()) {
            throw IllegalArgumentException("Can't save the person name: [${person.name}] is null")
        }
        if (person.address.isBlank()) {
            throw IllegalArgumentException("Can't save the person address: [${person.address}] is null")
        }
        // ...
    }
}
