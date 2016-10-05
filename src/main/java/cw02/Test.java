package cw02;

public class Test {
    public static void main(String[] args) {
        byte a = 10; // -128 ... 127
        byte b;
        b = 10;
//        System.out.println(a);
//        System.out.println(b);

        byte d = 10, e;

        short s = 32767; // 2 bytes -32 768 ... 32 767

//        -2^n-1 ... 2^n-1 - 1

        int i = 2_000_000_000; // 4 bytes

        long l = 9_000_000_000_000_000_000L; // 8 bytes

        boolean bool1 = true; // 1 byte
        boolean bool2 = false;
//        boolean bool3 = 2;

        char c1 = 10; // 2 bytes 0 ... 65 535
        char c2 = 'c';
        char c3 = '\u1234';

        int i2 = ' ';
        System.out.println(i2);

        float f = 10 / 3.0F; // 4 bytes
        double d1 = 10 / 3.0; // 8 bytes
        System.out.println(f);
        System.out.println(d1);
    }
}
