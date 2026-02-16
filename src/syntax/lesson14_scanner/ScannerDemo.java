package syntax.lesson14_scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("My name is: " + name + "\n"
                + "I'm" + age + "years old.");


    }

}
