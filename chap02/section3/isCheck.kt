package chap02.section3

fun main() {
    val num = 256

    if (num is Int) {
        println("$num")
    }
    else if (num !is Int) {
        println("Not a Int")
    }

    val x: Any
    x = "Hello"
    if (x is String)
        print(x.length)
}