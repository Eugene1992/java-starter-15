package cw07;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Main Start");
        int k = 10;
        method1();
        System.out.println(k);
        System.out.println("Main End");
    }

    static void method1() {
        System.out.println("Method 1 start");
        int k = 10;
        k++;
        method2();
        System.out.println("Method 1 end");
    }

    static void method2() {
        System.out.println("Method 2 start");
        int k = 10;
        k = k + 100;
        System.out.println("Method 2 end");
    }
}
