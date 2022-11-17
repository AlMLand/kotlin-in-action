package kotlin_example.chapter_6._6_2_5

private class WillNoAction : ActionProcess<Unit> {
    override fun process() = println("AA")
}

private class WillStringAction : ActionProcess<Int> {
    override fun process() = 3
}

private interface A
private interface B
private open class C
private open class D

private class E : A, B, C()