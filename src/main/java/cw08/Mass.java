package cw08;

import java.util.Arrays;

public class Mass {
    public static void main(String[] args) {
        int[] arr = {2, 5, -12, 10, 6};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(print(arr));
    }

    static String print(int[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++){
             s = s + arr[i] + ", " + "]";
        }
        return s;
    }
}
