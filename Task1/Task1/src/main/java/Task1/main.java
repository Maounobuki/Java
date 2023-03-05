//Урок 1. Знакомство с языком программирования Java
//        1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
//        .
//
//        2. Написать метод, который определяет, является ли год високосным,
//        и возвращает boolean (високосный - true, не високосный - false).
//        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
//        .
//
//        3. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

package Task1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;



public class main {
    public static void main(String[] args){
       //Objective 1
        /*int [] array = FillArray();
        System.out.println("Итоговый массив: "+Arrays.toString(array));
        PrintMinMax(array);

         */
        //Objective 2
        /* IsLeapYear();

         */

        //Objective 3
       int [] array = FillArray();
       System.out.println("Итоговый массив: "+Arrays.toString(array));
        Reorder(array);



    }

//     Objective 1 methods
//        private static int[] FillArray()
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите количество элементов массива:");
//        int limit  = in.nextInt();
//        int [] numbers = new int[limit];
//        System.out.print("Введите минимальное значение элементов массива:");
//        int min_value = in.nextInt();
//        System.out.print("Введите максимальное значение элементов массива:");
//        int max_value = in.nextInt();
//        if  (min_value > max_value) {
//            System.out.println("Вы ввели неверные значения,  попробуйте ещё раз, следуя инструкциям!");
//            FillArray();}
//        else {
//            for (int i = 0; i < numbers.length; i++) {
//                numbers[i] = new Random().nextInt(min_value, max_value + 1);
//            }
//        }
//       return numbers;
//
//    }
//
//    private static void PrintMinMax(int[] arr)
//        {
//
//
//        int max = Arrays.stream(arr)
//                .max()
//                .getAsInt();
//
//        int min = Arrays.stream(arr)
//                .min()
//                .getAsInt();
//
//        System.out.println("Минимальный элемент массива: " + min);
//        System.out.println("Максимальный элемент массива: " + max);
//    }
//}

//     Objective 2 methods
//    public static boolean IsLeapYear() {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите год:");
//        int year  = in.nextInt();
//
//        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0){
//            System.out.print("false");
//            return false;
//        }
//        else {
//            System.out.print("true");
//            return true;
//        }
//    }
    //     Objective 3 methods

    private static int[] FillArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива:");
        int limit  = in.nextInt();
        int [] numbers = new int[limit];
        System.out.print("Введите минимальное значение элементов массива:");
        int min_value = in.nextInt();
        System.out.print("Введите максимальное значение элементов массива:");
        int max_value = in.nextInt();
        if  (min_value > max_value) {
            System.out.println("Вы ввели неверные значения,  попробуйте ещё раз, следуя инструкциям!");
            FillArray();}
        else {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = new Random().nextInt(min_value, max_value + 1);
            }
        }
       return numbers;
    }


    private static void Reorder(int numbers [] ) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение переносимого элемента массива:");
        int val  = in.nextInt();
        int temp = 0;
        for (int i = 0; i < numbers.length; i ++){
            if (numbers[i] != val) {
               numbers[temp++] = numbers [i];
            }
        }
            while (temp < numbers.length)
                numbers[temp++] = val;

        System.out.println("Массив с перестановками: "+Arrays.toString(numbers));
    }
}