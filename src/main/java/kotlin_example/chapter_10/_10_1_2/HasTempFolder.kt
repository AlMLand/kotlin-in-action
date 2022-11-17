package kotlin_example.chapter_10._10_1_2

import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

class HasTempFolder {
    @get:Rule
    val folder = TemporaryFolder()

    @Test
    fun testTemporaryFolder() {
        val createFile = folder.createFile()
        println(createFile)
        val createFolder = folder.createFolder()
        println(createFolder)
    }
}

class TemporaryFolder : TestRule {
    fun createFile(): String = "create file"
    fun createFolder(): String = "create folder"
    override fun apply(base: Statement?, description: Description?): Statement = Statement1()
}

class Statement1 : Statement() {
    override fun evaluate() {
        println("test success")
    }
}
