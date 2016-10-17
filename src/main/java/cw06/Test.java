package cw06;

public class Test {
    public static void main(String[] args) {
        printMessage("Hello world!", 10);
        int a = 0;
        a = a + 10;
        printMessage("Hello Earth!", 5);
        int b = 20;
        int sum = sumOfTwo(a, b);
        System.out.println(sum);
        System.out.println(sumOfTwo(10, 20));
        System.out.println(sumOfTwo(sumOfTwo(10, sumOfTwo(10, 20)), sumOfTwo(sumOfTwo(10, 20), 100)));
        printSomething();
    }

    static void printMessage(String msg, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(msg);
        }
    }

    static int sumOfTwo(int numOne, int numTwo) {
        int sum = numOne + numTwo;
        return sum;
    }

    static void printSomething() {
        System.out.println("Something...");
    }
}
