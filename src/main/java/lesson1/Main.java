package lesson1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    //Entrance();
        Task2();
    }
     /* private static void Entrance() {
         Scanner in = new Scanner(System.in);
      System.out.println("Ваше имя");
        String name = in.next();
       System.out.printf("Привет, %s!", name);
       }*/
   //  Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

    private static void Task2() {
        int count_temp = 0;
        int count_max = 0;
        int[] arr = new int[]{1,1,0,1,1,1};
        for (int i = 0; i < arr.length ; i++)
        {
            if (arr[i] == 1) {
                count_temp ++;
            }
            else
            {
                if(count_temp > count_max)
                {
                    count_max = count_temp;
                }
                count_temp = 0;
            }
        }
        if(count_temp > count_max)
        {
            count_max =count_temp;
        }
        System.out.println(count_max);

    }

}
//public class Main {
//    public static void main(String[] args) {
//        Task();
//
//    }
//    private static void Task() {
//        Scanner nem = new Scanner(System.in);
//        System.out.println("Ваше Имя: ");
//        String name = nem.next();
//        System.out.printf("Привет,%s!", name);
//    }
//
//}