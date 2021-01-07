package chap03.section5

// String 클래스에 확장 함수 추가하기
fun main() {
    val source = "Hello world!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

fun String.getLongString(target: String) : String =
        if (this.length>target.length)this else target