package Services;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import Models.Toy;

public class Raffle {
    public List<Toy> listToys = new ArrayList<>();
    private int toy_count;

    public List<Toy> getToys() {
        return listToys;
    }

    public int getToy_count() {
        System.out.println("Количечтово игрушек доступных для выигрыша = "+toy_count);
        return toy_count;
    }

    // добавить игрушку в розыгрыш
    public List<Toy> add_toy_in_listToy(Toy name) {
        listToys.add(name);
        toy_count++;
        return listToys;
    }

    // удалить игрушку из спискка по имени
    public List<Toy> delete_toy_in_listToy(Toy name) {
        listToys.remove(name);
        toy_count--;
        return listToys;
    }

    // запись выигрышных игрушек в файл ".txt"
    public void saveInFile() {
        try (FileWriter writer = new FileWriter("winning_toys.txt", true)) {
            String text = listToys.get(0).getToy_name();
            writer.write(text + "\n");
            writer.close();
        } catch (Exception ex) {
            System.out.println("Ошибка записи файла");
        }
    }

    // чтение файла с выигранными игрушками
    public void readFile() {
        try {
            FileReader fr = new FileReader("winning_toys.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

        } catch (Exception ex) {
            System.out.println("Файл пуст либо не прочитан");
        }
    }

    // Розыгрыш, с регулируемым шансом на победу
    // если выигрыш, то записываем имя игрушки в файл
    // и удаляем её из списка разыгрываемых игрушек
    public void lottteryToy() {
        Scanner scan = new Scanner(System.in);
        int chance = 50;
        while (listToys.size() != 0){
        System.out.println("Шанс на выигрыш по умолчанию 50%");
        System.out.println("Если хотите изменить шанс на победу, нажмите 1");
        System.out.println("Если хотите оставить шанс на победу по умолчанию, нажмите 2");
        System.out.println("Если хотите покинуть лотерею введите 0");
        String changeСhance = scan.next();

        if (changeСhance.equals("0")){
            System.out.println("Вы покинули приложение");
            System.exit(0);
        }
        if (changeСhance.equals("1")) {
            System.out.println("введите число от 1 до 100, это процентное соотношение на победу!");
            chance = scan.nextInt();
        }
        if (chance >= 0 && chance <= 100) {
            Random rnd = new Random();
            int num = rnd.nextInt(100);
            if (num > chance) {
                System.out.println("вы проиграли, попробуйте cнова");
            }
            else if (num < chance) {
                System.out.println("поздравляем, вы выиграли" +listToys.get(0));
                saveInFile();
                delete_toy_in_listToy(listToys.get(0));
            }
        }

        else {
            System.out.println("Вы ввели неверное значение! попробуйте снова..");
        }
    }
    }
}
