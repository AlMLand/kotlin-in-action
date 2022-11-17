package kotlin_example.chapter_4._4_2_2

import javax.naming.Context
import javax.swing.text.AttributeSet

class MyButton : View {
    constructor() : super(ctx = null)

    //constructor(ctx: Context) : super(ctx) {}
    constructor(ctx: Context, attr: AttributeSet?) : super(ctx, attr) {}
    constructor(ctx: Context) : this(ctx, attr = null) {}
}
