package chap04.section3

import java.lang.Exception

// 사용자 예외 클래스 만들어 보기
class InvalidNameException(message: String) :Exception(message)

fun main() {
    var name = "kildong123"
    try{
        validateName(name)
    }catch(e: InvalidNameException) {
        println(e.message)
    }catch(e: Exception) { // 기탕 예외 처리
        e.message
    }
}

fun validateName(name: String) {
    if (name.matches(Regex(".*\\d+.*"))) {
        throw InvalidNameException("Your name : $name : contais numerals")
    }
}