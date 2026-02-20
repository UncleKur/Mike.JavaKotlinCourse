package mod1_syntax.syntax.lesson19_functions

fun main() {

    println("Получаем сумму чисел от 0 до 10: ${getSumOfNumbers(numberRange = 10)}")
    println("Получаем сумму двух чисел 4 и 8: ${getSumOfTwoNumbers(4, 8)}")

}

fun getSumOfNumbers(numberRange: Int): Int {
    var cnt = 0
    for (number in 0..numberRange) {
        cnt += number
    }
    return cnt
}

fun getSumOfTwoNumbers(a: Int, b: Int): Long = (a+b).toLong()