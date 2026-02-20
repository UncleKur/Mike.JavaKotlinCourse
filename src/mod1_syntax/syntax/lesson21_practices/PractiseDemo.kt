package mod1_syntax.syntax.lesson21_practices

fun main() {
    println(Practices.whoIsAWinner(162, 123, 70, 956))
}

fun getWinner(
    gryffindorPoints: Int,
    slytherinPoints: Int,
    ravenclawPoints: Int,
    hufflepuffPoints: Int
): String {
    return if (gryffindorPoints > slytherinPoints && gryffindorPoints > ravenclawPoints && gryffindorPoints > hufflepuffPoints) {
        "Гриффиндор победил! У него больше всех очков: $gryffindorPoints"
    } else if (slytherinPoints > gryffindorPoints && slytherinPoints > ravenclawPoints && slytherinPoints > hufflepuffPoints) {
        "Слизерин победил! У него больше всех очков: $slytherinPoints"
    } else if (ravenclawPoints > gryffindorPoints && ravenclawPoints > slytherinPoints && ravenclawPoints > hufflepuffPoints) {
        "Когтевран победил! У него больше всех очков: $ravenclawPoints"
    } else {
        "Пуфендуй победил! У него больше всех очков: $hufflepuffPoints"
    }
}