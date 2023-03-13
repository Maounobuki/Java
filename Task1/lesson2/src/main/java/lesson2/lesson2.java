//Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

package lesson2;
import java.util.Scanner;
public class lesson2 {


    public static void main(String[] args) {
//        System.out.println( build());
        System.out.println(letterCount());
        isPolyndrome();
    }
    public static StringBuilder build(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int limit  = in.nextInt();
        System.out.print("Введите первый элемент: ");
        String first = in.next();
        System.out.print("Введите второй элемент: ");
        String second = in.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < limit; i++) {
            sb.append((i % 2 == 0) ? first : second);
        }
        return sb;
    }
    public static StringBuilder letterCount(){
        StringBuilder sb = new StringBuilder();
        String str = "aaaabbbcddeee";
        int count = 1;
        for (int i = 0; i < str.length()- 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)){
                count++;
            }else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length()-1)).append(count);
        return  sb;
    }
        }
        
    public static boolean isPolyndrome(String str){

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            };
        }
        return true;
    }
    public static void Test(){
        StringBuilder sb = new StringBuilder();
        sb.append("TEST".repeat(100));
        try {
            FileWriter f1 = new FileWriter("test.txt");
            f1.write(String.valueOf(sb));
            f1.flush();
        }catch (Exception e){
            System.out.println("FAIL");
        }
    }
}

