package kotlin_example.chapter_8._8_2_5

import java.io.BufferedReader
import java.io.FileReader
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

private fun main() {
    val lock: Lock = ReentrantLock()
    var count: Int = 3
    lock.withLock { count++ }
    println(count)
}


private fun readFirstLineInFile(path: String): String? =
    BufferedReader(FileReader(path)).use { br -> return br.readLine() }