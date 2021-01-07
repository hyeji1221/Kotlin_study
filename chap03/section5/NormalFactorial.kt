package chap03.section5

fun main() {
    val num = 4
    val result : Long
    result = factorial(num)
    println("Factorial: $num -> $result")
}
fun factorial(n: Int): Long {
    return if (n==1) n.toLong() else n * factorial(n-1)
}