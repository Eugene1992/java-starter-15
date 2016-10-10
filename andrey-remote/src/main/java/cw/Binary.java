package cw;

/**
 * Created by Андрей on 10.10.2016.
 */
public class Binary {
    public static void main(String[] args) {
        int num = 8;
        int b = 0;
        String res = "";
        while (num != 0) {
            b = num % 2;
            res +=b;
            num = num / 2;
        }
        System.out.println(res);
    }
}
