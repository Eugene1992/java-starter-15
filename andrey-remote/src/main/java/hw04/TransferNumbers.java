package hw04;

import java.util.Scanner;

/**
 * 6. Написать программу, которая реализует следующий функционал:
 * 6.1 Пользователь вводит число в 10-ой системе счисления.
 * 6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
 * 1) в 2-ую
 * 2) в 8-ую
 * 3) в 16-ую
 * 6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
 * на экран результат.
 */
public class TransferNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в 10-ой системе: ");
        int number = scanner.nextInt();
        System.out.println("Предпочитаемая система счисления: (2,8,16)");
        int a = scanner.nextInt();
        int b;
        switch (a) {
            case 2:
                String res = "";
                while (number > 0) {
                    b = number % 2;
                    res = b + res;
                    number = number / 2;
                }
                System.out.println(res);
                break;
            case 8:
                String res1 = "";
                while (number > 0) {
                    b = number % 8;
                    res1 = b + res1;
                    number = number / 8;
                }
                System.out.println(res1);
                break;
            case 16:
                String res2 = "";
                while (number > 0) {
                    b = number % 16;
                    res2 = b + res2;
                    number = number / 16;
                }
                System.out.println(res2);
                break;

        }
    }

}
