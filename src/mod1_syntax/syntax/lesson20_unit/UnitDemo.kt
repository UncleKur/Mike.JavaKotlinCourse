package mod1_syntax.syntax.lesson20_unit

fun main() {

    var multiply: (Int, Int) -> Unit = { a, b -> println("a * b = ${a * b}") }

    multiply(2, 4)


}

