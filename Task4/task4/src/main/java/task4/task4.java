package task4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class task4 {public static void main(String[] args) {
    textApp();

}

    private static void textApp() {
        // Задача 1. Реализовать консольное приложение, которое:
        // Принимает от пользователя и “запоминает” строки.
        // Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        // Если введено revert, удаляет предыдущую введенную строку из памяти.

        Scanner in = new Scanner(System.in);
        LinkedList<String> text = new LinkedList<>();

        while (true) {
            System.out.println();
            System.out.print("Введите текст или команду: ");
            String entry = in.nextLine();



            if (entry.isBlank()){
                System.out.println("Ввод не может быть пустым!");
                text.addFirst(entry);
            }
            else if (entry.equalsIgnoreCase("exit")) {
                break;
            }
            else if (entry.equalsIgnoreCase("print")) {
                if (text.isEmpty()){
                    System.out.println("Нечего отображать - здесь пусто!!");
                }
                else {
                System.out.println(Arrays.toString(text.toArray()));}
            }

            else if (entry.equalsIgnoreCase("revert")) {
                String str = text.removeFirst();
                System.out.printf("текст %s был удален\n", str);
            }
            else {
                text.addFirst(entry);
            }
        }
        in.close();
    }

}
