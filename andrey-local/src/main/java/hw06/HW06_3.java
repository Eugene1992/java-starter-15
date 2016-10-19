package hw06;

/**
 * 2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 */
public class HW06_3 { //hw04
    public static void main(String[] args) {
        interval(0);
    }

    static void interval(int num) {
        for (int i = 0; i < 55; i += 2) {
            System.out.println(i + "");
        }
    }
}
