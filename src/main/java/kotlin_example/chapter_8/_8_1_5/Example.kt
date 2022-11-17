package kotlin_example.chapter_8._8_1_5

private enum class Delivery(val shippingCostCalculator: ShippingCostCalculator) {
    STANDARD(StandardCalculator()), EXPEDITED(ExpeditedCalculator())
}

class Order(val countItem: Int)

private const val EXPEDITED_MARGE = 2.1

private const val STANDARD_MARGE = 1.1

private fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    if (delivery == Delivery.EXPEDITED) {
        return { order -> EXPEDITED_MARGE * order.countItem }
    }
    return { order -> STANDARD_MARGE * order.countItem }
}

private fun getShippingCostCalculator2(delivery: Delivery): (Order) -> Double {
    return delivery.shippingCostCalculator.getCalculator()
}


private fun main() {
    val calculatorExpedited = getShippingCostCalculator(Delivery.EXPEDITED)
    println(calculatorExpedited(Order(4)))
    val calculatorStandard = getShippingCostCalculator(Delivery.STANDARD)
    println(calculatorStandard(Order(4)))

    println()

    val calculatorExpedited2 = getShippingCostCalculator2(Delivery.EXPEDITED)
    println(calculatorExpedited2(Order(4)))
    val calculatorStandard2 = getShippingCostCalculator2(Delivery.STANDARD)
    println(calculatorStandard2(Order(4)))
}