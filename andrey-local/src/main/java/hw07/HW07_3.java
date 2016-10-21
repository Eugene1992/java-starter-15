package hw07;

/**
 * 3. Вывести первую и вторую половину одномерного массива.
 */
public class HW07_3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        printArray(arr1);
    }
    static void printArray(int[] arr1) {
        int x = arr1.length / 2;
        for (int i = 0; i < x; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = x; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
