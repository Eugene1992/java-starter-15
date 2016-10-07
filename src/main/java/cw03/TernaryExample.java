package cw03;

/**
 * Created by evgeniy on 07/10/16.
 */
public class TernaryExample {
    public static void main(String[] args) {
        int a = 10;
        int b;

        if (a > 5) {
            if (a == 10) {
                b = 100;
            } else {
                b = 101;
            }
        } else {
            b = 1000;
        }

//        condition ? _if_true_ : _if_false_ ;

        int c = a > 5 ? a == 10 ? 100 : 101 : 1000;

        System.out.println(c);
    }
}
