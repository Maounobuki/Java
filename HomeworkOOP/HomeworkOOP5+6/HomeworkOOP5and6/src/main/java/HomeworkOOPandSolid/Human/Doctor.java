package HomeworkOOPandSolid.Human;



public class Doctor extends Human {

    public Doctor(String name, String status, String gender, Number age) {
        super(name, status, gender, age);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Тмя='" + name + '\'' +
                ", Должность='" + status + '\'' +
                ", Пол='" + gender + '\'' +
                ", Возраст=" + age +
                '}';
    }
}
