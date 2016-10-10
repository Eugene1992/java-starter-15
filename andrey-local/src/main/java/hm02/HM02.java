package hm02;

/**
 * Created by x on 07.10.2016.
 */
public class HM02 {
    public static void main(String[] args) {
        // 1. Создать четыре целочисленные переменные типов byte, short, int, long.
        byte b = 2 + 3;   //Задание2

        short s = 454 - 192;  //Задание3

        int i = 10 / 2;   //Задание4

        long l = 9_000_000_000L * 32; //Задание5

        byte b1 = 5;    //Задание6
        byte b2 = 15;
        byte b3 = (byte) (b1 + b2);

        short s1 = 4;//Задание7
        short s2 = 5;
        byte b4 = 2;
        byte b5 = (byte) ((byte) (s1 + s2) / b4);

        short s3 = 10; //Задание8
        short s4 = 2;
        short s5 = (short) (s3 / s4);
        byte b6 = 120;
        byte b7 = 10;
        byte b8 = (byte) (b6 / b7);
        int i1 = s5 * b8;

        int i2 = 10; //Задание9
        int i3 = 5;
        int i4 = i2;
        i3 = i2;
        i2 = i4;

        int x = 10;//Задание10
        int y = 3;
        x = x * y; // x = 130
        y = x / y; // y = 13
        x = x / y; // x = 10

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(b3);
        System.out.println(b5);
        System.out.println(s5);
        System.out.println(b8);
        System.out.println(i1);
        System.out.println(i4);
        System.out.println(x);
        System.out.println(y);
    }
}