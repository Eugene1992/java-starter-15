package hw03;

import java.util.Scanner;

/**
 * Создать программу, проверяющую и сообщающую на экран, является ли введенное с
 * консоли целое число, чётным либо нечётным.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        if (number % 2 == 0) System.out.println("Число чётное!");
        else System.out.println("Число нечётное");
    }
}
