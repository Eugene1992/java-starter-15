package cw05;

/**
 * Created by Student on 10/12/2016.
 */
public class LogicOr {
    public static void main(String[] args) {
        int k = 10;

        if (k > 0 | k % 0 == 2) {
            System.out.println("true");
        }
    }
}
