package hw03;

import java.util.Scanner;

/**
 * Задано три переменных, найти и вывести на экран переменную с максимальным значением
 * (значения всех переменных разные).
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Максимальное " + number1);
        } if  (number2 > number1 && number2 > number3) {
            System.out.println("Максимальное " + number2);
        } if
                (number3 > number1 && number3 > number2) System.out.println("Максимальное " + number3);
    }
}

