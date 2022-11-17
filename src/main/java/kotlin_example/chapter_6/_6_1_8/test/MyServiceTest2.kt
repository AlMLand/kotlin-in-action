package kotlin_example.chapter_6._6_1_8.test

import kotlin_example.chapter_6._6_1_8.MyService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MyServiceTest2 private constructor() {
    private lateinit var myService: MyService

    @BeforeEach
    fun setUp() {
        myService = MyService()
    }

    @Test
    fun test() {
        Assertions.assertEquals("test", myService.getMessage())
    }
}