package kotlin_example.chapter_8._8_1_5

private const val EXPEDITED_MULTIPLIER = 2.1

class ExpeditedCalculator : ShippingCostCalculator {
    override fun getCalculator(): (Order) -> Double = { order -> EXPEDITED_MULTIPLIER * order.countItem }
}