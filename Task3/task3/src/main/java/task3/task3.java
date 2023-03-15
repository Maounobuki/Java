package task3;

import java.util.*;

public class task3 {
    public static void main(String[] args) {
       // evenRemove(fillArray());
       // printMinMaxAverage(fillArray());
        intRemover();
}

// Задача 1.  Пусть дан произвольный список целых чисел, удалить из него четные числа
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


    // Задача 2. Задан целочисленный список ArrayList.
    // Найти минимальное, максимальное и среднее арифметическое из этого списка.

    private static double calculateAverage(ArrayList<Integer> nums) {
        double average = 0;
        double sum = 0;
        for (Integer i : nums) {
            sum += i;
        }
        average = sum/nums.size();
        return average;
    }

    private static void printMinMaxAverage(ArrayList<Integer> nums) {

        int maxValue = Collections.max(nums);
        int minValue = Collections.min(nums);
        double average = calculateAverage(nums) ;
        System.out.printf("Максимальное значение среди элементов: %d\n",maxValue);
        System.out.printf("Минимальное значение среди элементов: %d\n", minValue);
        System.out.printf("Среднее арифметическое элементов: %.2f\n", average);
    }
    //Задача 3. Создать список типа ArrayList<String>.
    // Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
    private static void intRemover() {
               List<String> elements = List.of("-1","фывгшфр","alkaks","62716asdf","653","777","18","124");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int capacity = in.nextInt();

        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            int index = new Random().nextInt(elements.size());
            str.add(elements.get(index));
        }
        System.out.println(str.toString());

        for (int i = str.size()-1; i >= 0 ; i--) {
            try {
                Integer.parseInt(str.get(i));
                str.remove(i);
            } catch (NumberFormatException e) {
                continue;
            }
        }
        System.out.println(str.toString());
    }
}






