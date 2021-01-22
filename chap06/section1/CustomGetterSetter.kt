package chap06.section1

class User2(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.toUpperCase()
        }
    var age: Int = _age
}

fun main() {
    var user1 = User2(1, "Kildong", 35)
    user1.name = "coco"
    println("user3.name = ${user1.name}")
}