package mod1_syntax.syntax.lesson7_final;

public class Final {

    public static void main(String[] args) {

        int firstVar, secondVar;
        int firstDeclaratedVar = 1, secondDeclaratedVar = 5;
        final int firstFinalIntVar = 1, secondFinalInt;
        final var unchangedableVariable = 5;

        firstDeclaratedVar = 3;
        System.out.println(firstDeclaratedVar);

        //cant assign
//        firstFinalIntVar = 3;

    }

}
