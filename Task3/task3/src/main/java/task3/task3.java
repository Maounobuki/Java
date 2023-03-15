package task3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        evenRemove(fillArray());


}

//    Пусть дан произвольный список целых чисел, удалить из него четные числа
//   (в языке уже есть что-то готовое для этого)

    public static ArrayList<Integer> fillArray (){
        ArrayList<Integer> nums = new ArrayList<>();
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите размер массива: ");
        Integer size = in.nextInt();
        System.out.printf("Введите верхний предел массива: ");
        Integer maxValue = in.nextInt();
        for (int i = 0; i < size; i++) {
            nums.add(random.nextInt(maxValue));
        }
        System.out.println(nums.toString());
        return nums;
    }

    private static void evenRemove (ArrayList<Integer> nums){

        nums.removeIf(i -> i%2 == 0 && i!=0);
        System.out.println(nums.toString());
    }

    }



