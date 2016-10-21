package hw07;

/**
 *  2. Вывести все числа одномерного массива в обратном порядке.
 */
public class HW07_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arrayDown(arr);
    }

    static void arrayDown(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

}

