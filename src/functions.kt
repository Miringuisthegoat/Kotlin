fun main() {
    //Standard Library Function
    var result = Math.max(34, 89)
    println(result)

    add()   // 👈 call the function
    student("Mary",56)
}
//User -Defined Function

fun add() {
    println(45 + 20)
}

fun student(name:String, age: Int){
    println("My name is $name.I'm $age years old ")
}
