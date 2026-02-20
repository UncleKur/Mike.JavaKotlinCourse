package mod1_syntax.syntax.lesson18_for;

public class ForDemo {
    public static void main(String[] args) {
        int cnt = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            cnt += i;
        }
        System.out.println("Сумма от 0 до 10 = " + cnt);
    }
}

