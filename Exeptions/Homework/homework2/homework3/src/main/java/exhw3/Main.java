package exhw3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //пример реализации класса PasswordVerifier
        Scanner in = new Scanner(System.in);
        PasswordVerifier password = new PasswordVerifier();
        System.out.println("Введите пароль");
        password.isValid(in.nextLine());


    }

}
