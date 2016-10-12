package cw05;

/**
 * Created by Student on 10/12/2016.
 */
public class OneAndTest {
    public static void main(String[] args) {
        /*int a = 10;

        if (a < 5 & a % 0 == 0) {
            System.out.println("True");
        }*/
        System.out.println(10 & 2);
//        0000 1010
//       &
//        0000 0010
//        ---------
//        0000 0010

        System.out.println(10 | 2);
//        0000 1010
//       |
//        0000 0010
//        ---------
//        0000 1010

        System.out.println(10 ^ 2);
//        0000 1010
//       ^
//        0000 0010
//        ---------
//        0000 1000

        System.out.println(~-10 + 1);

    }
}
