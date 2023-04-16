package HomeworkOOPandSolid.Animal;



public class Cat extends Animal {

    public Cat(String type, String name, String color, String gender, Number age, Number weight, Number health) {
        super(type, name, color, gender, age, weight, health);
    }

    /**
     * Перегруженный метод озвучивания голоса животного
     * @return возвращает голос животного типом String
     */
    @Override
    public String voice() {return "Mяу, Мяу";}

    @Override
    public String toString() {
        return "Cat{" +
                "Порода='" + type + '\'' +
                ", Кличка='" + name + '\'' +
                ", Цвет='" + color + '\'' +
                ", Пол='" + gender + '\'' +
                ", Возраст=" + age +
                ", Вес=" + weight +
                ", Здоровье=" + health +
                '}';
    }
}
