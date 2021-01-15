package chap05.section4.innerref

open class Base {
    open val x: Int = 1
    open fun f() = println("Base Class f()")
}

class Child: Base() {
    override val x: Int = super.x + 1
    override fun f() = println("Child class f()")

    inner class Inside {
        fun f() = println("Inside Class f()")
        fun test() {
            f()
            Child().f()
            super@Child.f()
            println("[Inside] super@Child.x: ${super@Child.x}")
        }
    }
}

fun main() {
    val c1 = Child()
    c1.Inside().test()
}