package hw03;
import java.util.Scanner;

/**
 * Используя IntelliJ IDEA, создайте класс Interval.
 * Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
 * промежуток [0 - 14) [15 - 35) [36 - 50) [50 - 100]. Если да, то укажите, в какой именно промежуток.
 * Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
 * выводится соответствующее сообщение.
 */
public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        interval(a);

    }

    public static void interval(int number) {
        if (number == 50) {
            System.out.println("Число в промежутках [36 - 50) [50 - 100] ");
        }
        if (number >= 0 && number <= 14) {
            System.out.println("Число в промежутке [0 - 14]");
        }
        if (number > 14 && number <= 35) {
            System.out.println("Число в промежутке [15 - 35]");
        }
        if (number > 35 && number < 50) {
            System.out.println("Число в промежутке [36 - 50]");
        }
        if (number > 50 && number <= 100) {
            System.out.println("Число в промежутке [50 - 100]");
        }
    }
}


