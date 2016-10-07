package cw03;

/**
 * Created by evgeniy on 07/10/16.
 */
public class Test {
    public static void main(String[] args) {
        int _ = 2;
        int $ = 2;
        int A = 2;
        int Z = 2;
        int a233 = 2;
        int goto2 = 2;

        final int MY_VAR;
        MY_VAR = 10;

        byte b = 10;
        short s = b;

        int i1 = 100;
        int i2 = 160;
        byte b2 = (byte)(i1 + i2);

//      0000 0001 0000 0100
//                0000 0100

        System.out.println(b2);

        String name = "Andrey";
        int age = 20;
        System.out.println("My name is " + name + "! I'm " + age + " years old!");
        System.out.printf("My name is %s!\nI'm %d years old!", name, age);
    }
}
