package syntax.lesson10_String;

public class StringDemo {

    public static void main(String[] args) {
        //String - immutable
        //StringBuilder - однопоточный?, изменяемый
        //StringBuffer - для многопточного? изменяемый так же

        String firstStr = "Mihail";
        String secondStr = "mihail";

        //equals (сравниваем объекты)
        System.out.println("Strings equals: " + firstStr.equals(secondStr));
        System.out.println("Strings equals ignore case: " + firstStr.equalsIgnoreCase(secondStr));
        System.out.println();

        //length (размер строки)
        System.out.println("String length of firstStr: " + firstStr.length());
        System.out.println();

        //Получение подстроки
        String greeting = "Hello, World!";
        String subStringGreeting1 = greeting.substring(2);
        String subStringGreeting2 = greeting.substring(3, 8);
        String subStringGreeting3 = greeting.substring(
                greeting.indexOf('W'),
                greeting.indexOf('!') //последний индекс
        );
        System.out.println("Substring of subStringGreeting1: " + subStringGreeting1);
        System.out.println("Substring of subStringGreeting2: " + subStringGreeting2);
        System.out.println("Substring of subStringGreeting3: " + subStringGreeting3);
        System.out.println();

        //Проверка наличия подстроки (чувствительно к регистру!)
        System.out.println(greeting.contains("World"));

        //удаление пробелов с двух сторон trim()
        var smth = "  sdf  ";
        System.out.println(smth);
        System.out.println(smth.trim());

        //replace
        System.out.println(greeting.replace(',', '.'));

        //StringBuilder
        //ссылается на одну область памяти, в отличии от обычного стринга, не создаёт новые объекты с новыми ссылками
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(", ");
        sb.append("world");
        System.out.println(sb);



    }

}
