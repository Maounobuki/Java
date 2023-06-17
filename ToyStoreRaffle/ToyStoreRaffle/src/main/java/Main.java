import Models.Toy;
import Services.Raffle;

public class Main {
    public static void main(String[] args) {
    // Создание объектов "Игрушки"
    Toy bear = new Toy(1, "Bear",20);
    Toy car = new Toy(2, "Car", 30);
    Toy cubes = new Toy(3, "Cubes", 40);
    Toy lego = new Toy(4, "Lego", 10);
    Toy balloons = new Toy(5, "Balloons", 25);
    Toy ball = new Toy(6, "Ball",60);
    Toy sword = new Toy(7, "Sword",10);

    // Создание объекта "Лотерея" с добавлением игрушек в розыгрыш
    Raffle toy_lottery = new Raffle();
    toy_lottery.add_toy_in_listToy(bear);
    toy_lottery.add_toy_in_listToy(car);
    toy_lottery.add_toy_in_listToy(cubes);
    toy_lottery.add_toy_in_listToy(lego);
    toy_lottery.add_toy_in_listToy(balloons);
    toy_lottery.add_toy_in_listToy(ball);
    toy_lottery.add_toy_in_listToy(sword);

    // Запускаем розыгрыш с управлением выпадения выигрыша, затем читаем файл
    toy_lottery.lottteryToy();
    toy_lottery.readFile();
    toy_lottery.lottteryToy();
    toy_lottery.readFile();
    // Проверяем оставшиеся игрушки в списке
    toy_lottery.getToys();
    // просматриваем число игрушек в списке
    toy_lottery.getToy_count();
}
}
