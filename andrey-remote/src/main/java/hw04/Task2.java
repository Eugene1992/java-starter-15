package hw04;

/**
 * 2. Создайте программу, выводящую на экран первые 55 элементов
 * последовательности 1 3 5 7 9 11 13 15 17 ….
 */
public class Task2 {
    public static void main(String[] args) {
        int res = 1;
        int counter = 0;
        while (counter < 55) {
            System.out.print(res + " ");
            res += 2;
            counter++;
        }
    }
}
