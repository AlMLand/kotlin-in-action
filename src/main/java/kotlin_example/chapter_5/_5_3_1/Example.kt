package kotlin_example.chapter_5._5_3_1

private fun main() {
    val naturalIntegers = generateSequence(0) { it + 1 }
    val sequenceTo100 = naturalIntegers.takeWhile { it <= 100 }
    println("sum: ${sequenceTo100.sum()}")
    println("sum of: ${sequenceTo100.sumOf { it.toDouble() }}")


    val listInt = listOf(1, 2, 3, 4)
        .asSequence()
        .map { println("map: $it"); it * it }
        .filter { println("filter: $it"); it % 2 == 0 }
        .toList()

    println(listInt)


    val listIntParallel = listOf(1, 2, 3, 4)
        .parallelStream()
        .map { println("map: $it"); it * it }
        .filter { println("filter: $it"); it % 2 == 0 }
        .toList()

    println(listIntParallel)
}