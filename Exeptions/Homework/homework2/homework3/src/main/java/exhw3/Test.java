package exhw3;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {


        //пример использования файлового менеджера
        FileManager fileManager = new FileManager();
        fileManager.writeFile("E:\\Java\\Exeptions\\Homework\\homework2\\homework3\\src\\main\\java\\exhw3\\test.txt", " Тествая запись");
        fileManager.copyFile("E:\\Java\\Exeptions\\Homework\\homework2\\homework3\\src\\main\\java\\exhw3\\test.txt", "E:\\Java\\Exeptions\\Homework\\homework2\\homework3\\src\\main\\java\\exhw3\\test2.txt");
        System.out.println(fileManager.readFile("E:\\Java\\Exeptions\\Homework\\homework2\\homework3\\src\\main\\java\\exhw3\\test2.txt"));
    }
}