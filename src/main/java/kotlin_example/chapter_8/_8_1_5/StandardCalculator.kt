package kotlin_example.chapter_8._8_1_5

private const val STANDARD_MULTIPLIER = 1.1

class StandardCalculator : ShippingCostCalculator {
    override fun getCalculator(): (Order) -> Double = { order -> STANDARD_MULTIPLIER * order.countItem }
}