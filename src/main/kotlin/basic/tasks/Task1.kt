package vorobev.basic.tasks
/** Объявите функцию main()
Сохраните в переменные firstMessage и secondMessage сообщения введенные пользователем
Выведете значение переменных в консоль - каждое значение с новой строки*/
fun main() {
    val firstMessage = readln()
    val secondMessage = readln()

    println("$firstMessage\n$secondMessage")
}