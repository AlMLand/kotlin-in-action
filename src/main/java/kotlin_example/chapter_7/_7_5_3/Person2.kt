package kotlin_example.chapter_7._7_5_3

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Person2(
    private val name: String,
    age: Int,
    salary: Int
) : PropertyChangeAware() {
    private val observer = { prop: KProperty<*>, oldValue: Int, newValue: Int ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
    var age by Delegates.observable(age, observer)
    var salary by Delegates.observable(salary, observer)
}