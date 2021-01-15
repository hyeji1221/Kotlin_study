package chap05.section3.override

open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {

    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol") // 오버라이딩 가능한 메서드
}

// 주 생성자를 사용하는 상속
class Lark(name: String, wing: Int, beak: String, color: String) : Bird(name, wing, beak, color) {
    fun singHitone() = println("Happy Song!")
}

class Parrot (name: String, wing: Int = 2, beak: String, color: String, var language : String ="natural"):Bird(name, wing, beak, color) {
    fun speak() = println("Speak! $language")
    override fun sing(vol: Int) {
        println("I'm a parrot the volume level is $vol")
        speak()
    }
}

fun main() {
    val parrot = Parrot(name = "myparrot", beak = "short", color = "multiple")
    parrot.language = "English"
    parrot.sing(5)
}