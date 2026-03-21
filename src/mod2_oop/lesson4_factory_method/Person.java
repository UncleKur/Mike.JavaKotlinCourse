package mod2_oop.lesson4_factory_method;

import java.util.Date;

public class Person {
    private String name;
    private int age;
    private Date birth;

    public static final String KIND = "Человек";
    public static int count = 0;

    // Блок инициализации в Java - {} и всё (может быть статичным). Проверить - является ли дурным тоном использовать блок инициализации
    // в java, по сравнению с kotlin? в котлин, в частности в разработке на андройд, блоки инициализации используются
    // для связи с БД, подгрузки каких либо АПИ (но это не точно, нужно уточнить в будущем!)
    {
        System.out.println("Экземпляр класса с Java");
        count++;
        System.out.println("Количество экзиков: " + count);
    }

    public Person() {
        name = "";
        age = 0;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getBirth() {
        return birth;
    }

    public Person(String name) {
        //this() - вызов конструктора пустого,
        this();
        this.name = name;
    }



    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public void sayHello() {
        System.out.println(getName() + " приветствует тебя!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static Person getInstance() {
        return new Person();
    }

    public static Person getInstance(String name){
        return new Person(name);
    }

    public static Person getInstance(String name, int age) {
        return new Person(name, age);
    }



}
