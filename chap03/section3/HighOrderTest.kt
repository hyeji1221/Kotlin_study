package chap03.section3

// 람다식을 사용하는 고차 함수
fun main() {
    var result: Int
    val multi = {x:Int ,y:Int -> x * y}
    result = multi(10, 20)
    println(result)
}