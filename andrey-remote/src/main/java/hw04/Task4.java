package hw04;

/**
 * 4. Создайте программу, выводящую на экран первые 20 элементов
 * последовательности 2 4 8 16 32 64 128 ….
 */
public class Task4 {
    public static void main(String[] args) {
        for (byte i = 0, res = 2; i < 20; i++, res *= 2) {
            System.out.println(res);
        }
    }
}
