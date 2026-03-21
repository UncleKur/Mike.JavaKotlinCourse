package mod2_oop.lesson4_factory_method

class PersonKt {
    var name: String = ""
    var age: Int = 0


    fun sayHello() {
        println("Привет! Я $name")
    }

    //блок инициализации в котлин init {}
    init {
        println("Экземпляр класса с котлина")
        COUNT++
        println("$COUNT столько экземпляров")
    }

    constructor()
    constructor(name: String) {}
    constructor(name: String, age: Int) {}


    override fun toString(): String {
        return "PersonKt(name='$name', age=$age)"
    }



    companion object {
        const val KIND = "Человек"
        private var COUNT: Int = 0;

        fun getInstance(): PersonKt {
            println("Создан")
            return PersonKt()
        }

        fun getInstance(name: String): PersonKt = PersonKt(name)

        fun getInstance(name: String, age: Int): PersonKt = PersonKt(name, age)

    }


}