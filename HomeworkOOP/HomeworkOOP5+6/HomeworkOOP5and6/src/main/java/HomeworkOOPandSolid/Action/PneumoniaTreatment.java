package HomeworkOOPandSolid.Action;

public class PneumoniaTreatment {
    /**
     * Метод уменьшения здоровья животному
     * @param x принимает текущее значение жизней животного
     * @return возвращает новое значение здоровья животного
     */
    public static Integer Pneumonia(int x) {return x - (int) Numbers.getR(50);}
}
