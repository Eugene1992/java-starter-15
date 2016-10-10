package hw03;

import java.util.Scanner;

/**
 * В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
 * будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
 * либо сообщать, что корней нет.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3-и вещественных числа:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double D = (b * b) - (4 * a * c);
        if (D < 0) {
            System.out.println("Корней нет.");
        } else {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println(root1 + " " + root2);
        }
    }
}
