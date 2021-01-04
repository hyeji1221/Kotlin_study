package chap03.section3


fun main() {
    noParam { "Hello world!" }
    noParam { "Hello world!" }
    oneParam { a -> "Hello world! $a" }
    moreParam{a, b -> "Hello World! $a $b"}
    moreParam { _, b -> "Hello World! $b" } // 특정 매개변수를 사용하지 않을 때 _ 사용
    withArgs("Arg1", "Arg2", {a, b -> "Hello World! $a $b"})
    withArgs("Arg1", "Arg2") {a, b -> "Hello World! $a $b"} // 람다식 함수가 마지막 매개변수인 경우 소괄호 밖으로 뺼 수 있음
    twoLambda({a, b -> "First $a $b"}, {"Second $it"})
    twoLambda({a, b -> "First $a $b"}) {"Second $it"}
}

fun noParam(out: () -> String) = println(out()) // 람다식에 매개변수가 없는 경우
fun oneParam(out: (String)-> String) = println(out("OneParam")) // 람다식의 매개변수가 1개인 경우
fun moreParam(out: (String, String) -> String) = println(out("OneParam", "TwoParam")) // 람다식의 매개변수가 2개인 경우
fun withArgs(a:String, b:String, out : (String, String) -> String) = println(out(a, b)) // 일반 매개변수와 람다식 매개변수 같이 사용
fun twoLambda(first : (String, String) -> String, second: (String) -> String) { // 일반 함수에 람다식 매개변수 2개 이상 사용
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}
