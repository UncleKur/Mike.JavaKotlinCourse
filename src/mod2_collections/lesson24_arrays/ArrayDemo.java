package mod2_collections.lesson24_arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        //6 - сколько хранится элементов в массиве
        //в массиве нельзя изменить кол-во элементов
        int[] arraysNumber = new int[6];

        //ещё один вид инициализации
        int[] arraysNumber2 = {1, 2, 3, 4, 5, 6, 7, 2, 3, 45, 1};
        arraysNumber[0] = 4;
        arraysNumber[1] = 3;
        arraysNumber[2] = 5;
        arraysNumber[3] = 11;
        arraysNumber[4] = 2;
        arraysNumber[5] = 7;

        System.out.println(arraysNumber);
        System.out.println(Arrays.toString(arraysNumber));

        for (int i = 0; i < arraysNumber.length; i++) {
            System.out.println("The index is: " + i + ", the value is: " + arraysNumber[i]);
        }

    }
}
