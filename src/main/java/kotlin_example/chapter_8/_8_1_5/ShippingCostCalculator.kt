package kotlin_example.chapter_8._8_1_5

interface ShippingCostCalculator {
    fun getCalculator(): (Order) -> Double
}