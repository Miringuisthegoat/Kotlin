fun main() {
    var day = 4

    var result = when(day){
        1 -> "Monday"
        1 -> "Tuesday"
        1 -> "Wednesday"
        1 -> "Thursday"
        1 -> "Friday"
        1 -> "Saturday"
        1 -> "Sunday"
        else -> "Invalid day of the week"
    }
    println("Today is $result")
}