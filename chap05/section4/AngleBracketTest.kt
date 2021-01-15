package chap05.section4

open class A {
    open fun f() = print("A Class f()")
    fun a() = println("A Class a()")
}

interface B{
    fun f() = println("B interface f()")
    fun b() = println("B Interface b()")
}

class C : A(), B{
    override fun f() = println("C Class f()")

    fun test() {
        f()
        b()
        super<A>.f()
        super<B>.f()
    }
}

fun main() {
    val c= C()
    c.test()
}