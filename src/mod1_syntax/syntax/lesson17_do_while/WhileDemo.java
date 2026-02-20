package mod1_syntax.syntax.lesson17_do_while;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

        int cnt = 0;

//        while(cnt < 3) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter your age: ");
//            int age = scanner.nextInt();
//
//            if (age >= 18) {
//                System.out.println("You are adult person.");
//            } else if (age >= 13) {
//                System.out.println("You are teenager.");
//            } else {
//                System.out.println("You are infant");
//            }
//            cnt++;
//        }
        System.out.println("End of while");

        //выполнится хотя бы один раз
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("You are adult person.");
            } else if (age >= 13) {
                System.out.println("You are teenager.");
            } else {
                System.out.println("You are infant");
            }
            cnt++;
        } while(cnt < 4);

    }
}
