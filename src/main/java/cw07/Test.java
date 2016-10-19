package cw07;

public class Test {
    public static void main(String[] args) {
        System.out.println(fibR(5));
    }

    public static int fibI(int num) {
        int a = 1;
        int b = 1;
        int sumFib;
        int res = 0;
        for (int i = 0; i < num - 2; i++) {
            sumFib = a + b;
            a = b;
            b = sumFib;
            if (i == num) res = b;
        }
        return res;
    }

    public static int fibR(int num) {
        if (num < 2) return num;
        return fibR(num - 1) + fibR(num - 2);
    }
}
