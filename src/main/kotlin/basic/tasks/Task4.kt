package vorobev.basic.tasks

/**
 * Создайте функцию main()
 * Cчитайте и сохраните в переменные значения Sample Input
 * Используйте шаблон для вывода значений в консоль в определенном формате (Sample Output).
 * */

fun main() {
    val name = readln()
    val dateOfBirth = readln()
    val placeOfBirth = readln()
    val father = readln()
    val mother = readln()
    val brother = readln()
    val wife = readln()

    println("Имя: $name\n" +
            "Дата рождения: $dateOfBirth\n" +
            "Место рождения: $placeOfBirth\n" +
            "Отец: $father\n" +
            "Мать: $mother\n" +
            "Брат: $brother\n" +
            "Жена: $wife")
}