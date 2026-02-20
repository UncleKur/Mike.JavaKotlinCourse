package mod2_collections.lesson24_arrays

fun main() {

    //int[] arraysNumber2 = {1, 2, 3, 4, 5, 6, 7, 2, 3, 45, 1};
    val arrayNumbers = arrayOf(1, 2, 35, 46, 456, 234)

    //эквивалентно int[] arraysNumber = new int[6];
    val anotherWayArray = IntArray(2)

    println("Размер нашего массива = ${arrayNumbers.size}")

//    for (num in 0..23)
    for (num in arrayNumbers) {
        println("Значение: $num")
    }

    for ((index, value) in arrayNumbers.withIndex()){
        println("Индекс: $index; Значение: $value")
    }
}

