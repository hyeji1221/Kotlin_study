package chap03.section3.funcfunc

// 함수를 반환값으로 사용하는 함수
fun main() {
    println("funcFunc: ${funcFunc()}")
}

fun sum(a:Int, b:Int) = a +b
fun funcFunc( ) : Int {
    return sum(2,2)
}