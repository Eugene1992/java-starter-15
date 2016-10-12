package cw05;

/**
 * Created by Student on 10/12/2016.
 */
public class LogicAnd {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            }
        }
        if (b > a) {
            if (b > c) {
                System.out.println(b);
            }
        }
        if (c > b){
            if (c > a) {
                System.out.println(c);
            }
        }

        if (a > b && a > c) {
            System.out.println(a);
        }
        if (b > a && b > c) {
            System.out.println(b);
        }
        if (c > b && c > a){
            System.out.println(c);
        }
    }
}
