

import java.util.Scanner;
package lesson2;


public class objective1 {

    public static void main(String[] args) {
        isPalindrome(stringInput());


        writeFile("test.txt");

    }




    // Напишите метод, который принимает на вход строку (String) и определяет
    // является ли строка палиндромом (возвращает boolean значение).
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

    // 2. Напишите метод, который составит строку, состоящую из 100 повторений слова
    // TEST и метод, который запишет эту строку в простой текстовый файл,
    // обработайте исключения.

    private static void writeFile(String path) {


        StringBuilder sb = new StringBuilder();
        sb.append("TEST\n".repeat(100));
        try(FileWriter f1 = new FileWriter(path);) {
            f1.append(String.valueOf(sb));
            f1.flush();
        } catch (Exception e) {
            System.out.println("Ошибка");
        }

    }
}

