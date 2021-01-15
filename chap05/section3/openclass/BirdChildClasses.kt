package chap05.section3.openclass

open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

// 주 생성자를 사용하는 상속
class Lark(name: String, wing: Int, beak: String, color: String) : Bird(name, wing, beak, color) {
    fun singHitone() = println("Happy Song!")
}

// 부 생성자를 사용하는 상속
class Parrot : Bird {
    val language : String
    constructor(name: String, wing: Int, beak: String, color: String, language: String) :super(name, wing, beak, color) {
        this.language = language
    }
    fun speak() = println("Speak! $language")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")
    val lark = Lark("mylark", 2, "long", "brown")
    val parrot = Parrot("myparrot", 2, "short", "multiple", "korean")

    lark.singHitone()
    parrot.speak()
    lark.fly()
}