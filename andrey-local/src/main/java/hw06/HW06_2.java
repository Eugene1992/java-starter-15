package hw06;

/**
 * 1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
 */
public class HW06_2 { //hw04
    public static void main(String[] args) {
        interval(0);
    }

    static void interval(int ch) {
        for (int i = 1000; i < 1500; i += 3) {
            System.out.println(i + " ");
        }
    }
}
