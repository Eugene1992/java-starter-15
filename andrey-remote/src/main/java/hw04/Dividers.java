package hw04;

import java.util.Scanner;

/**
 * 8. Выведите на экран все положительные делители натурального числа, введенного пользователем.
 */
public class Dividers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String res = "";
        int number = scanner.nextInt();
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                res += i + " ";
            }
        }
        System.out.println(res);
    }
}
