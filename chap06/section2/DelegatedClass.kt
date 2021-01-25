package chap06.section2

interface Car {
    fun go() : String
}

class VanImpl(val power: String): Car {
    override fun go() = "은 짐을 적재하며 $power 을 가집니다"
}

class SportImpl(val power: String): Car {
    override fun go() = "은 경주용에 사용되며 $power 을 가집니다"
}

class CarModel(val model: String, impl: Car): Car by impl {
    fun carInfo() {
        println("$model ${go()}")
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100 마력"))
    val my350z = CarModel("350z 2008", SportImpl("350마력"))

    myDamas.carInfo()
    my350z.carInfo()
}