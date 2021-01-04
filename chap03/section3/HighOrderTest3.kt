package chap03.section3

// 인자와 반환값이 없는 람다식 함수
fun main() {
    val out: () -> Unit = {println("Hello World!")}
    
    out() // 함수처럼 사용 가능
    val new = out
    new()
}