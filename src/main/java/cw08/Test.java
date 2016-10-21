package cw08;

public class Test {
    public static void main(String[] args) {
        getSequence(10, 100, 2);
    }

    static void getSequence(int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(i + " ");
        }
    }

    static void getSequence(int start, int end, int step) {
        for (int i = start; i < end; i += step) {
            System.out.print(i + " ");
        }
    }

    static void f() {

    }

    static void f(int k) {

    }

    static void f(double k) {

    }

    static void f(double k, int h) {

    }

    static void f(int h, double k) {

    }

}
