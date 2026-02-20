package mod1_syntax.syntax.lesson10_String

fun main() {
    var firstStr = "Тестирование"
    var secondStr: String? = "6"
    println(firstStr.length)
    println(secondStr?.length ?: "Тут совсем пусто + грустно")
}