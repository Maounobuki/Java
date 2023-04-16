package HomeworkOOPandSolid.Action;

public class RabiesTreatment {
    /**
     * Метод уменьшения здоровья животному
     * @param x принимает текущее значение жизней животного
     * @return возвращает новое значение здоровья животного
     */
    public static Integer Rabies(int x) {return x - (int) Numbers.getR(80);}
}
