package chap03.section3

fun main() {
    val result = callByValue(lambda())
    println(result)
}
fun callByValue(b: Boolean):Boolean {
    println("CallByValue function")
    return b
}

val lambda: () -> Boolean = {
    println("lambda function")
    true   // 마지막 표현식 문장의 결과가 반환
}