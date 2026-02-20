package mod1_syntax.syntax.lesson5_variables;

public class Variables {
    public static void main(String[] args) {



        //System.out.println("Аргумент 1: " + args[0] + "\n" + "Аргумент 2: " + args[1]);

        System.out.println(Integer.parseInt("00111111", 2));

        //byte -128..127 (256 | 2 + '-' signed)
        //2^8
        byte byteNumber = -128;
        System.out.println("Byte number: " + byteNumber);

        //Short -32768..32767
        //2^16
        short shortNumber = 32767;
        System.out.println("Short number: " + shortNumber);

        char charSymbol = '3';
        System.out.println("Char symbol is: " + charSymbol);

        boolean isBoolean;
        isBoolean = true;
        System.out.println("Boolean variable is: " + isBoolean);


        System.out.println(Math.powExact(2, 16));

        //casting - приведение типов
        //неявный (безопасный?) кастинг
        short varForCasting = byteNumber;
        System.out.println("After casting varForCasting: " + varForCasting);

        //явный кастинг, возможна потеря данных при таких операциях
        int intVar = 6_000_012;
        byte byteNewVar = (byte) intVar;
        System.out.println("After casting byteNewVar: " + byteNewVar);

        double doubleVar = 4.14;
        int newIntFromDouble = (int) doubleVar;
        System.out.println("After casting newIntFromDouble: " + newIntFromDouble);

    }
}
