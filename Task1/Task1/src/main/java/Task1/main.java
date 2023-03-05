package Task1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;



public class main {
    public static void main(String[] args){
        int [] array = FillArray();
        System.out.println("Итоговый массив: "+Arrays.toString(array));
        PrintMinMax(array);
    }

        private static int[] FillArray()
    {
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

    private static void PrintMinMax(int[] arr)
        {


        int max = Arrays.stream(arr)
                .max()
                .getAsInt();

        int min = Arrays.stream(arr)
                .min()
                .getAsInt();

        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }
}
