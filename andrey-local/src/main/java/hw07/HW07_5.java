package hw07;

/**
 * 5. Найти сумму всех элементов в массиве.
 */
public class HW07_5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(arraySum(arr));
    }
    static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
