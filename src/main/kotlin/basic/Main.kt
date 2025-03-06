package vorobev.basic

fun main() {
    var name: String = "Ivan"
    println("Name: " + name)

    // Error
    // name = 25  ->

    // val <==> final in Java

    // !!! max use val

    val autoMark = "BMW"

    var nameAutoInitType = "Auto init to String type"
    println("Name auto init String type: " + name)

    var age: Int
    age = 23
    println("My age: " + age)
}