package hw04;

import java.util.Scanner;

/**
 * 5. Выведите на экран первые 20 членов последовательности Фибоначчи.
 */
public class Task5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int counter = 18;
        int sum_fib;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < counter; i++) {
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            System.out.print(sum_fib + " ");
        }
    }
}
