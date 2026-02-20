package mod1_syntax.syntax.lesson21_practices;

public class Practices {
    public static void main(String[] args) {

        int pointsPerYearGryffindor = 50;
        int pointsPerYearSlytherin = 76;
        int pointsPerYearRavenclaw = 88;
        int pointsPerYearHufflepuff = 22;

        System.out.printf("""
                Кто же победил в ежегодном соревновании?
                У Гриффиндора %d очков!
                У Слизерена %d очков!
                У Когтеврана %d очков!
                У Пуфендуя %d очков!%n
                """.trim(), pointsPerYearGryffindor, pointsPerYearSlytherin, pointsPerYearRavenclaw, pointsPerYearHufflepuff);

        System.out.println("Думаем по джавовски...");
        whoIsAWinner(pointsPerYearGryffindor, pointsPerYearSlytherin, pointsPerYearRavenclaw, pointsPerYearHufflepuff);

        System.out.println("Думаем по котлиновски...");
        System.out.println(PractiseDemoKt.getWinner(6, 5, 17, 36));
    }

    public static void whoIsAWinner(
            int gryffindorPoints,
            int slytherinPoints,
            int ravenclawPoints,
            int hufflepuffPoints
    ) {
        if (gryffindorPoints > slytherinPoints && gryffindorPoints > ravenclawPoints && gryffindorPoints > hufflepuffPoints) {
            System.out.println("Гриффиндор победил! У него больше всех очков: " + gryffindorPoints);
        }
        if (slytherinPoints > gryffindorPoints && slytherinPoints > ravenclawPoints && slytherinPoints > hufflepuffPoints) {
            System.out.println("Слизерин победил! У него больше всех очков: " + slytherinPoints);
        }
        if (ravenclawPoints > gryffindorPoints && ravenclawPoints > slytherinPoints && ravenclawPoints > hufflepuffPoints) {
            System.out.println("Когтевран победил! У него больше всех очков: " + ravenclawPoints);
        }
        if (hufflepuffPoints > gryffindorPoints && hufflepuffPoints > slytherinPoints && hufflepuffPoints > ravenclawPoints) {
            System.out.println("Пуфендуй победил! У него больше всех очков: " + hufflepuffPoints);
        }

    }


}
