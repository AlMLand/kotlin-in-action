package kotlin_example.chapter_7._7_5_3

import java.beans.PropertyChangeSupport
import kotlin.reflect.KProperty

class ObservableProperty(
    private var propertyValue: Int,
    private val changeSupport: PropertyChangeSupport
) {
    operator fun getValue(person: Person, property: KProperty<*>): Int = propertyValue

    operator fun setValue(person: Person, property: KProperty<*>, newValue: Int) {
        val oldValue: Int = propertyValue
        propertyValue = newValue
        changeSupport.firePropertyChange(property.name, oldValue, newValue)
    }
}