package cw03;

/**
 11. Дано число от 0 до 127 в десятичной системе исчисления. Написать программу, которая
     переводит данное число в двоичную систему исчисления и выводит в консоль.
     Запрещается использовать циклы (for, while и т.д.) или условные операторы(if/esle/?:)! Пример:

     int b = 13;
     ...
     < Ваш код >
     ...
     Вывод в консоль:
     0000 1101
 */
public class Solution {
    public static void main(String[] args) {
        int b = 126; // 0 ... 127
        int i = b % 2;
        b = b / 2;
        int i1 = b % 2;
        b = b /2;
        int i2 = b % 2;
        b = b /2;
        int i3 = b % 2;
        b = b / 2;
        int i4 = b % 2;
         b = b / 2;
        int i5 = b % 2;
        b = b / 2;
        int i6 = b % 2;
        System.out.print(i6);
        System.out.print(i5);
        System.out.print(i4);
        System.out.print(i3);
        System.out.print(i2);
        System.out.print(i1);
        System.out.print(i);
    }
}
