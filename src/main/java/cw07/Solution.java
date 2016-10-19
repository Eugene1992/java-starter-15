package cw07;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(arraySum(arr));
        arrayMin(arr);
    }

    static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    static void arrayMin(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
