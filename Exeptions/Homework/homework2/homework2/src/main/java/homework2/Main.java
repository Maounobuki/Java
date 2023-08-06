package homework2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidNumberException, DivisionByZeroException, NumberSumException, NumberOutOfRangeException {
  //task1
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        numberValidator(number);

  //task2
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print(divide(num1, num2));

  //task 3

        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.print("Введите третье число: ");
        int c = in.nextInt();
        numberCorrector(a, b,c);


    }

   //methods

  public static void numberValidator (int number) throws  InvalidNumberException{
      if (number <= 0) {
          throw new InvalidNumberException("Некорректное число");
      } else {
          System.out.println("Число корректно");
      }
  }

    public static int divide(int a, int b)  throws DivisionByZeroException {
        if (a == 0 || b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return a / b;
    }
    public static void numberCorrector(int a, int b, int c) throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException{
        if (a > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (b < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if (a + b < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if (c == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        System.out.println("Проверка пройдена успешно");

    }
}

