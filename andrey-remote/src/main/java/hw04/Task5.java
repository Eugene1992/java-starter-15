package hw04;

/**
 * 5. Выведите на экран первые 20 членов последовательности Фибоначчи.
 */
public class Task5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int counter = 18;
        int sumFib;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < counter; i++) {
            sumFib = a + b;
            a = b;
            b = sumFib;
            System.out.print(sumFib + " ");
        }
    }
}
