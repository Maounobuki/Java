//Урок 1. Знакомство с языком программирования Java
//        1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
//        .
//
//        2. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
//        не високосный - false).
//        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
//        .
//
//        3. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//        а остальные - равны ему.
package task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class main {

//    Objective 1
    public static void main(String[] args) {
        int [] array = FillArray();
        System.out.printf("Массив:");
        System.out.println(Arrays.toString(array));
        PrintMaxMin(array);
    }

    private static int[] FillArray() {
        System.out.print("Введите размер массива:");
        Scanner in = new Scanner(System.in);
        int arr_lenght = in.nextInt();
        int[] numbers = new int[arr_lenght];
        System.out.printf("Введите предельное значение для элементов массива:");
        int limit = in.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(limit+1);

        }

                return numbers;
    }

    private static void PrintMaxMin (int[] A) {


        int max = Arrays.stream(A)
                .max()
                .getAsInt();

        int min = Arrays.stream(A)
                .min()
                .getAsInt();

        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Наибольший элемент массива: " + max);
    }
}
