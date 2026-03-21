package mod2_oop.lesson4_factory_method;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassesDemo {
    public static void main(String[] args) {

        //Создаём объект "фабричным" методом
        Person mike = Person.getInstance();
        mike.setName("Mike");
        mike.setAge(16);
        mike.sayHello();


        //Person killReal = new Person("Kirill");
        Person killReal = Person.getInstance("Kirill");
        killReal.sayHello();

        Person luba = Person.getInstance("Luba", 26);
        luba.sayHello();
        luba.setBirth(new Date()); //создавая объект Date() без параметров, будет записана текущая дата/время на момент запуска
        System.out.println(new SimpleDateFormat("yyyy.MM.dd").format(luba.getBirth())); //отформатировал к удобному виду

        //статическая переменная класса
        System.out.println(Person.KIND);

        //kotlin инстанс
        PersonKt pkt1 = PersonKt.Companion.getInstance();
        PersonKt pkt3 = PersonKt.Companion.getInstance();
        PersonKt pkt2 = PersonKt.Companion.getInstance("Aik");




    }
}
