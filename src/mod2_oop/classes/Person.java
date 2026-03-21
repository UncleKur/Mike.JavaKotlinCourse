package mod2_oop.classes;

public class Person {
    String name;
    int age;


    public void sayHello() {
        System.out.println(getName());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
