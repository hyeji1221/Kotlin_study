package chap04.section3

// inline을 사용한 람다식의 반환
fun main() {
    chap04.section3.noinline.retFunc()
}
inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc(){
    println("start of retFunc")
    inlineLambda(13,3){
        a,b->
        val result = a+b
        if(result >10)return
        println("result : $result") //-> 실행안됨
    }
    println("end of retFunc") //실행안됨 (주의) --> inline형 이라 내용만 가져오므로 return 함수가 전체종료
}