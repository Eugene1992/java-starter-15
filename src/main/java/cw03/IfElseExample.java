package cw03;

/**
 * Created by evgeniy on 07/10/16.
 */
public class IfElseExample {
    public static void main(String[] args) {
        int k1 = 12;
        int k2 = 12;
        boolean b = true;

        if (k1 == k2) { // > < >= <= != ==
            System.out.println("k1 == k2");
        } else if (k1 > k2) {
            System.out.println("k1 > k2");
        } else {
            System.out.println("k1 < k2");
        }


    }
}
