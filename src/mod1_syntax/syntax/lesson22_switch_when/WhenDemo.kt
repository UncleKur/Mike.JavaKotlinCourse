package mod1_syntax.syntax.lesson22_switch_when

fun main() {
    println(getWinner(11, 12, 15, 16))
    println(getWinner(19, 12, 15, 16))
    println(getWinner(11, 22, 15, 16))
    println(getWinner(11, 12, 22, 16))
    println(getWinner(11, 12, 12, 12))
}

fun getWinner(
    gryffindorPoints: Int,
    slytherinPoints: Int,
    ravenclawPoints: Int,
    hufflepuffPoints: Int
): String {
    val maxPoints = maxOf(gryffindorPoints, slytherinPoints, ravenclawPoints, hufflepuffPoints)
    return when (maxPoints) {
        gryffindorPoints -> "Гриффиндор"
        slytherinPoints -> "Слизерин"
        ravenclawPoints -> "Когтевран"
        else -> "Пуффендуй"
    }
}