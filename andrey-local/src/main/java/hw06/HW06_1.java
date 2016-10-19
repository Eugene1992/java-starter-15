package hw06;
import java.util.Scanner;

/**
 * Задание 2
 Создать программу, проверяющую и сообщающую на экран, является ли введенное с
 консоли целое число, чётным либо нечётным.
 */
public class HW06_1 {
    public static void main(String[] args) { //Задание 2 HW03
        even(0);

    }
    static void even(int num1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число не чётное");
        }
    }
}

