// Напишите метод, который принимает на вход строку (String) и определяет
// является ли строка палиндромом (возвращает boolean значение).
package lesson2;

import java.util.Scanner;

public class objective1 {

    public static void main(String[] args) {
        isPalindrome(stringInput());
    }


    private static String stringInput() {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите текст: ");
        String str = in.next();
        in.close();
        return str;
    }

    private static boolean isPalindrome(String st) {

        for (int i = 0; i < st.length() / 2; i++) {
            if (st.charAt(i) != st.charAt(st.length() - 1 - i)) {

                System.out.println("Эта строка не палиндром");
                return false;}
        }
        System.out.println("Эта строка палиндром");
        return true;

    }
}

