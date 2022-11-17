package kotlin_example.chapter2.e
import kotlin_example.chapter2.e.Color.*

enum class Color (val r: Int, val g: Int, val b: Int) {
    RED(255,0,0),
    ORANGE(255,165,0),
    YELLOW(255,255,0),
    GREEN(0,255,0),
    BLUE(0,0,255),
    INDIGO(70,0,130),
    VIOLET(238,130,238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(){
    println(mix(BLUE, YELLOW))
    println(mixOptimized(YELLOW, BLUE))
}

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
        (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
        else -> throw Exception("wrong color mix [$c1, $c2]")
    }

fun mix(c1: Color, c2: Color) =
    when(setOf(c1, c2)){
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("wrong color mix [$c1, $c2]")
    }

fun getWarmT(color: Color) =
    when(color){
        RED, ORANGE, YELLOW -> "warm"
        GREEN -> "lauwarm"
        BLUE, INDIGO, VIOLET -> "kalt"
}

fun getMnemonic(color: Color) =
    when(color){
        RED -> "R"
        ORANGE -> "O"
        YELLOW -> "Y"
        GREEN -> "G"
        BLUE -> "B"
        INDIGO -> "I"
        VIOLET -> "V"
    }

