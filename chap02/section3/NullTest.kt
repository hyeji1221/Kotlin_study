package chap02.section3

fun main() {
    var str1 : String? = "Hello Kotlin" // string과 string?은 서로 다른 자료형
    str1 = null
    println("str1: ${str1?.length}")
    println("str1: ${str1!!.length}")
}