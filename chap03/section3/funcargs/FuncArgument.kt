package chap03.section3.funcargs

// 일반 함수를 인자나 반환값으로 사용하는 함수
fun main() {
    val res1 = sum(3,2) // 일반 인자
    val res2 = mul(sum(3,3), 3) // 인자에 함수를 사용

    println("res1: $res1, res2: $res2")
}

fun sum(a:Int, b:Int) = a+b
fun mul(a:Int, b:Int) = a*b