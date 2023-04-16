package HomeworkOOPandSolid.Action;

public class AnimalTreatment {
    /**
     * Метод лечения у доктора
     * @param x принимает текущее количество здоровья животного
     * @return возвращает новое значение здоровья животного
     */
    public static Integer healing (int x) {return x + (int) Numbers.getR(5);}
}
