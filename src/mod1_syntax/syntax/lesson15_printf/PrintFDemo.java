package mod1_syntax.syntax.lesson15_printf;

import java.time.LocalDateTime;

public class PrintFDemo {
    public static void main(String[] args) {

        // %s - string (строки) %d - decimal (числа) %f - floating point (десятичное число) %e (экспоненциальное представление)

        String nameForTest = "Old Person";
        int ageForTest = 32;
        float height = 1.83f;
        String testStr = "Information about some person: ";

        System.out.printf(testStr + "%n%s. Have a %d years old. %n", nameForTest, ageForTest);
        System.out.printf("His height: %.2f m %n", height);

        //%tF, %tT - дата, время
        //LocalDateTime - время сейчас
        LocalDateTime now = LocalDateTime.now();
        System.out.printf("Current date and time: %tF %tT", now, now);


    }
}
