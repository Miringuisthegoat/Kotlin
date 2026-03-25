open class Animal{
    var age = 2
    var gender = "Male"


}

open class Dog : Animal(){
    fun bark(){
        println("Woof!! Woof!!")
    }
}

class Cat : Dog(){
    fun meow(){
        println("Meow!! Meow!!")

    }
}

fun main() {
    var a =Animal()
    var b =Dog()
    var c =Cat()
}