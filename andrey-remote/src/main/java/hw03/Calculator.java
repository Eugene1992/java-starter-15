package hw03;

import java.util.Scanner;

/**
 * Используя IntelliJ IDEA, создайте класс Calculator.
 * Напишите программу - консольный калькулятор.
 * Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
 * Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
 * Выведите на экран результат выполнения арифметической операции.
 * В случае использования операции деления, организуйте проверку попытки деления на ноль.
 * И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
 * пользователя.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа: ");
        double operand1 = sc.nextDouble();
        double operand2 = sc.nextDouble();
        calc(operand1, operand2);

    }

    public static void calc(double number1, double number2) {
        System.out.println("Ведите предпочитаемую операцию: (+,-,*,/)");
        Scanner scanner = new Scanner(System.in);
        String sign = scanner.nextLine();
        double summ;
        switch (sign) {
            case "+":
                summ = number1 + number2;
                System.out.println(summ);
                break;
            case "-":
                summ = number1 - number2;
                System.out.println(summ);
                break;
            case "*":
                summ = number1 * number2;
                System.out.println(summ);
                break;
            case "/":
                if (number2 > 0) {
                    summ = number1 / number2;
                    System.out.println(summ);
                } else {
                    System.out.println("Ошибка!");

                }
        }
    }
}