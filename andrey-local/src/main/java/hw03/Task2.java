package hw03;

import java.util.Scanner;

/**
  Задание 2
 Создать программу, проверяющую и сообщающую на экран, является ли введенное с
 консоли целое число, чётным либо нечётным.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("even number");
        }else{
            System.out.println("number does not even");
        }
    }

}
