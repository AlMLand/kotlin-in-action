package kotlin_example.chapter_6._6_1_3

private class Address(
    val street: String,
    val houseNumber: Int,
    val city: String,
    val postCode: Int,
    val country: String
)

private class Company(
    val companyName: String,
    val address: Address?
)

private class Person(
    val firstName: String,
    val lastName: String,
    val company: Company?
)


private fun main() {
    val p1 = Person(
        "T", "M_d",
        Company("TCompany", Address("a", 1, "b", 2, "c"))
    )
    println(p1.getCountry())
    p1.printShippingAddress()

    val p2 = Person(
        "T", "M_nd",
        Company("TCompany", null)
    )
    println(p2.getCountry())
    p2.printShippingAddress()
}

private fun Person.printShippingAddress() {
    val add = company?.address ?: throw IllegalArgumentException("no address is available")
    with(add) {
        println(street)
        println(houseNumber)
    }
}

private fun Person.getCountry(): String {
//    val country = company?.address?.country
//    return if (country != null) country else "unknown"
//    return country ?: "unknown"
    return company?.address?.country ?: "unknown"
}