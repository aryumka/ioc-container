package context

import types.Foo
import kotlin.reflect.KClass

class Container {
    private val registeredBean = mutableMapOf<String, Any>()

    fun register(name: String, kClass: KClass<*>) {
        val bean = kClass
        registeredBean[name] = bean
    }

    fun <T> getBean(name: String): T {
        return registeredBean[name] as T
    }
}
