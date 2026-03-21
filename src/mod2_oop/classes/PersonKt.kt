package mod2_oop.classes

class PersonKt {
    var name: String = ""
    var age: Int = 0

    fun sayHello(){
        println("Привет! Я $name")
    }

    override fun toString(): String {
        return "PersonKt(name='$name', age=$age)"
    }


}