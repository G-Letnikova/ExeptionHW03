package task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws PasswordVerifierExeptoin {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.print("Введите пароль: ");
                PasswordVerifier password = new PasswordVerifier(scanner.next());
                flag = false;
                System.out.println("Пароль корректен: " + password);

            } catch (Exception e) {
                System.out.println("Ошибка! " + e.getMessage());
            }
        }
        scanner.close();
    }
}