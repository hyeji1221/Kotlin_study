package chap06.section1

class User1(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }
    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val user1 = User1(1, "Kildong", 30)
    user1.age = 35
    println("user1.age = ${user1.age}")
}