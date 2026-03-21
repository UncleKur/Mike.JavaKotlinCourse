package mod2_oop.lesson3_encapsulation;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassesDemo {
    public static void main(String[] args) {

        Person mike = new Person();
        mike.setName("Mike");
        mike.setAge(16);
        mike.sayHello();


        Person killReal = new Person("Kirill");
        killReal.sayHello();

        Person luba = new Person("Luba", 26);
        luba.sayHello();
        luba.setBirth(new Date()); //создавая объект Date() без параметров, будет записана текущая дата/время на момент запуска
        System.out.println(new SimpleDateFormat("yyyy.MM.dd").format(luba.getBirth())); //отформатировал к удобному виду

        //статическая переменная класса
        System.out.println(Person.KIND);



    }
}
