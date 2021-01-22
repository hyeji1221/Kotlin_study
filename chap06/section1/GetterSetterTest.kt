package chap06.section1

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id // 불변
    var name: String = _name // 변경 가능
    var age: Int = _age // 변경 가능
}

fun main() {
    val user = User(1, "Sean", 30)
    val name = user.name
    user.age = 41
    println("name: $name, ${user.age}")
}