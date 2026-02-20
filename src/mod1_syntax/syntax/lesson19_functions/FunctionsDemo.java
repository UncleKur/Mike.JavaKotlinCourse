package mod1_syntax.syntax.lesson19_functions;

public class FunctionsDemo {
    public static void main(String[] args) {

        System.out.printf("Сумма 15 и 35 равна: %d%n", sumOfNumber(15, 35));

    }

    public static long sumOfNumber(int a, int b) {
        return a + b;
    }
}
