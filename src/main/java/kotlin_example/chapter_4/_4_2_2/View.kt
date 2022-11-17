package kotlin_example.chapter_4._4_2_2

import javax.naming.Context
import javax.swing.text.AttributeSet

open class View {
    constructor(ctx: Context? = null) {}
    constructor(ctx: Context, attr: AttributeSet?) {}
}