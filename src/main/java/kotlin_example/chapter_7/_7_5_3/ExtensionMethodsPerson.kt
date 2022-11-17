package kotlin_example.chapter_7._7_5_3

import java.beans.PropertyChangeListener

fun Person.addVariableListener() {
    this.addPropertyChangeListener(PropertyChangeListener {
        println("property ${it.propertyName} changed from ${it.oldValue} to ${it.newValue}")
    })
}