package kotlin_example.chapter2

import java.io.BufferedReader
import java.io.Reader
import java.io.StringReader

fun main() {
    println(read(BufferedReader(StringReader("34"))))
    read2(BufferedReader(StringReader("33")))
}

fun read2 (reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException){
        return
    }
    println(number)
}

fun read (reader: BufferedReader) =
    try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (nfe: NumberFormatException) {
        nfe.message
    } finally {
        reader.close()
    }
