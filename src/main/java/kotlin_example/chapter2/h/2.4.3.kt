package kotlin_example.chapter2.h

import java.util.TreeMap

val letterBynary = TreeMap<Char, String>()

fun main(){
    makeMap()
    readMap()
    readListAndIndex()
}

fun makeMap(){
    for (let in 'A'..'F') {
        val binary = Integer.toBinaryString(let.code)
        letterBynary[let] = binary
    }
}

fun readMap(){
    for ((letter, binary) in letterBynary) {
        println("$letter -> $binary")
    }
}

fun readListAndIndex(){
    val list = arrayListOf(11,22,33,44,55)
    for ((index, element) in list.withIndex()) {
        println("index=$index | element=$element")
    }
}