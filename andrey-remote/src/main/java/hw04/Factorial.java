package hw04;

import java.util.Scanner;

/**
 * 7. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
