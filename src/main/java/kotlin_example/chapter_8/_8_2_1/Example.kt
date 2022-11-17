package kotlin_example.chapter_8._8_2_1

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

private fun main() {
    val lock = ReentrantLock()
    foo(lock)
}

private fun foo(lock: Lock) {
    println("before sync")
    synchronized(lock = lock) { println("action") }
    println("after sync")
}


private inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}