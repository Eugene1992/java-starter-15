package hm02;
/*
11.* Дано число от 0 до 127 в десятичной системе исчисления. Написать программу, которая переводит данное число в двоичную
систему исчисления и выводит в консоль. Запрещается использовать циклы (for, while и т.д.) или условные операторы(if/esle/?:)! Пример:

int b = 13;
...
< Ваш код >
...
Вывод в консоль:
0000 1101
целое число - 0, не целое - 1
 */

public class HM02 {
    public static void main(String[] args) {
            int b = 13;
            int i = b % 2;
            b = b / 2;
            int i1 = b % 2;
            b = b / 2;
            int i2 = b % 2;
            b = b / 2;
            int i3 = b % 2;
            b = b / 2;
        System.out.println(i3);
        System.out.println(i2);
        System.out.println(i1);
        System.out.println(i);
    }
}