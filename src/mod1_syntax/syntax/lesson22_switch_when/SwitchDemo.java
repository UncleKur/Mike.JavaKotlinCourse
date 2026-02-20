package mod1_syntax.syntax.lesson22_switch_when;

public class SwitchDemo {
    public static void main(String[] args) {

        System.out.println("Выйграл: " + getWinner(1, 4, 4, 2));

    }

    public static String getWinner(
            int gryffindorPoints,
            int slytherinPoints,
            int ravenclawPoints,
            int hufflepuffPoints
    ) {
        int maxPoints = Math.max((Math.max((Math.max(gryffindorPoints, slytherinPoints)), ravenclawPoints)), hufflepuffPoints);

        if(maxPoints == gryffindorPoints) {
            return "Грифа";
        } else if (maxPoints == slytherinPoints) {
            return "Слиза";
        } else if (maxPoints == ravenclawPoints) {
            return "Коготь";
        } else {
            return "Пуфик";
        }

        //решение через Optional
//        OptionalInt maxPointsAnotherVer = IntStream.of(
//                gryffindorPoints,
//                slytherinPoints,
//                ravenclawPoints,
//                hufflepuffPoints
//        ).max();
//        return ("Выйграл: " + maxPointsAnotherVer);


        //switch работает только с финальными константами
        //        switch (maxPoints) {
//            case gryffindorPoints:
//                return "Гриффиндор";
//            case slytherinPoints:
//                return "Слизерин";
//            case ravenclawPoints:
//                return "Когтевран";
//            default:
//                return "Пуфендуй";
//        }

//
    }
}
