package mod2_oop.lesson2_constructor;




public class ClassesDemo {
    public static void main(String[] args) {

        Person mike = new Person();
        mike.name = "Mike";
        mike.age = 16;
        mike.sayHello();


        Person killReal = new Person("Kirill");
        killReal.sayHello();

        Person luba = new Person("Luba", 26);
        luba.sayHello();




    }
}
