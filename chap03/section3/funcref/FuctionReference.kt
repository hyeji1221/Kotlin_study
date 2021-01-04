package chap03.section3.funcref

// 다른 함수의 참조에 의한 일반 함수 호출
fun main() {
    val res1 = funcParam(3,2,::sum) // 인자와 반환값이 있는 함수
    println(res1)

    hello(::text) // 인자가 없는 함수

    val likeLambda = ::sum // 일반 변수의 값처럼 할당
    println(likeLambda(6,6))
}

fun sum(a:Int, b:Int) = a+b
fun text(a:String, b:String) = "Hi! $a $b"

fun funcParam(a:Int, b:Int, c: (Int, Int)->Int): Int {
    return c(a,b)
}

fun hello(body: (String, String)->String) : Unit {
    println(body("Hello", "World"))
}