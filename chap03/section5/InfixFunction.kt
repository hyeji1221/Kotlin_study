package chap03.section5

// 자료형 클래스 Int에 확장 함수 multiply()를 만들고 중위 표현법 사용
fun main() {
    val multi = 3 multiply 10
    println("multi: $multi")
}
infix fun Int.multiply(x: Int): Int {
    return this * x
}