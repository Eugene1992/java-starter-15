package hw03;

import java.util.Scanner;

/**
 * Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
 * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число : ");
        double number1 = sc.nextDouble();
        System.out.println("Введите второе число : ");
        double number2 = sc.nextDouble();
        double mod1 = 10 - number1;
        double mod2 = 10 - number2;
        if (mod1 < 0) {
            mod1 = mod1 * -1;
        }
        if (mod2 < 0) {
            mod2 = mod2 * -1;
        }
        if (mod1 < mod2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}
