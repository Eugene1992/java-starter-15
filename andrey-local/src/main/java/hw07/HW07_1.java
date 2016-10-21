package hw07;

/**
 * 1. Вывести в консоль все парные числа одномерного массива.
 */
public class HW07_1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        arrayPairNum(arr1);
    }

    static void arrayPairNum(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if(i % 2 == 1)
            System.out.print(arr1[i] + " ");
            }
        }
    }
