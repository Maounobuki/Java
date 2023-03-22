package Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task5 {




        public static void main(String[] args) {
            Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
            addNumber("Ivanov", 123, bookPhone);
            addNumber("Ivanov", 1234, bookPhone);
            addNumber("Petrov", 546585, bookPhone);
            addNumber("Sidorov", 8956477, bookPhone);
            addNumber("Ivanov", 12356233, bookPhone);
            addNumber("Petrov", 787897, bookPhone);
            printBook(bookPhone);


            repeatCount();

        }


       //Задание 1. Реализуйте структуру телефонной книги с помощью HashMap,
       // учитывая, что 1 человек может иметь несколько телефонов.

        public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
            if (map.containsKey(key)) {
                map.get(key).add(value);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }

        }

        public static void printBook(Map<String, ArrayList<Integer>> map){
            for (var item : map.entrySet()) {
                String phones = "";
                for(int el: item.getValue()){
                    phones = phones + el + ", ";
                }
                System.out.printf("%s: %s \n", item.getKey(), phones);
            }
        }
    // Задание 2. Пусть дан список сотрудников:
    // Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
    // Отсортировать по убыванию популярности.
    private static void printWorkersList(Map<String, ArrayList<String>> database) {
        for (String name : database.keySet()) {
            System.out.print(name + " :  ");
            for (String telephon : database.get(name)) {
                System.out.printf(telephon + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void repeatCount() {

        ArrayList<String> workersList = new ArrayList<>();
        workersList.add("Иван Иванов");
        workersList.add("Кристина Белова");
        workersList.add("Светлана Петрова");
        workersList.add("Анна Мусина");
        workersList.add("Анна Крутова");
        workersList.add("Иван Юрин");
        workersList.add("Петр Лыков");
        workersList.add("Павел Чернов");
        workersList.add("Петр Чернышов");
        workersList.add("Мария Федорова");
        workersList.add("Марина Светлова");
        workersList.add("Мария Савина");
        workersList.add("Мария Рыкова");
        workersList.add("Марина Лугова");
        workersList.add("Анна Владимирова");
        workersList.add("Иван Мечников");
        workersList.add("Петр Петин");
        workersList.add("Иван Ежов");

        Map<String, ArrayList<String>> workersMap = new HashMap<>();

        for (String string : workersList) {
            String[] worker = string.split(" ");
            if (workersMap.containsKey(worker[0])){
                workersMap.get(worker[0]).add(worker[1]);
            }
            else{
                workersMap.put(worker[0],new ArrayList<>(Arrays.asList(worker[1])));
            }
        }
        printWorkersList(workersMap);
        printNumberOfRepetitions(workersMap);
    }

    private static void printNumberOfRepetitions(Map<String, ArrayList<String>> workersMap) {
        for (String key : workersMap.keySet()) {
            if (workersMap.get(key).size()>1){
                System.out.println(key + " " + workersMap.get(key).size() );
            }
        }
    }

    }

