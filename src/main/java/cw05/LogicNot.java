package cw05;

/**
 * Created by Student on 10/12/2016.
 */
public class LogicNot {
    public static void main(String[] args) {
        boolean flag = false;
        int k = 10;

        while (!flag) {
            if (k == 5) flag = true;
            System.out.println(k);
            k--;
        }
    }
}
